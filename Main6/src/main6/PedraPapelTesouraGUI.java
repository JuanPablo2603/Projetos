package main6; // Define o pacote onde a classe está localizada

// Importações necessárias para componentes gráficos (Swing) e manipulação de eventos
import java.awt.Color; // Usado para definir cores
import java.awt.Font;  // Usado para definir tipos e tamanhos de fonte
import java.awt.event.ActionEvent; // Evento disparado por interações com botões
import javax.swing.*; // Importa todos os componentes do Swing (JFrame, JButton, JLabel etc)
import java.awt.event.ActionListener; // Interface para ouvir ações de componentes (ex: cliques)

public class PedraPapelTesouraGUI extends JFrame implements ActionListener {
    // Botões que representam a escolha do jogador
    JButton rockButton, scissorButton, paperButton;

    // Labels para mostrar a escolha do computador e os placares
    JLabel computerChoice;
    JLabel playerScoreLabel, computerScoreLabel;

    // Objeto da lógica do jogo (back-end), que calcula resultados
    PedraPapelTesoura pedrapapeltesoura;

    // Construtor da interface gráfica
    public PedraPapelTesouraGUI() {
       super("Pedra,Papel, Tesoura e Juan");// Título da janela

        setSize(550,650);// Define a largura e altura da janela
        setLayout(null); // Define o layout como absoluto (coordenadas manuais)
        setLocationRelativeTo(null); // Centraliza a janela no centro da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra o programa ao fechar a janela

        addGUIComponents(); // Adiciona todos os componentes da interface
        setVisible(true); // Torna a janela visível na tela

        pedrapapeltesoura = new PedraPapelTesoura(); // Instancia a lógica do jogo
    }

    // Método responsável por criar e posicionar todos os elementos visuais
    private void addGUIComponents() {
        // Label para o placar do computador
        computerScoreLabel = new JLabel("Computador: 0"); // Texto inicial
        computerScoreLabel.setBounds(0, 43, 450, 30); // Posição e tamanho
        computerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26)); // Fonte personalizada
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto
        add(computerScoreLabel); // Adiciona à janela

        // Label que mostra a escolha atual do computador
        computerChoice = new JLabel("?"); // Inicia como "?"
        computerChoice.setBounds(175, 118, 98, 81); // Posição e tamanho
        computerChoice.setFont(new Font("Dialog", Font.PLAIN, 18)); // Fonte
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza
        computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Adiciona borda
        add(computerChoice); // Adiciona à janela

        // Label que mostra o placar do jogador
        playerScoreLabel = new JLabel("Jogador: 0");
        playerScoreLabel.setBounds(0, 317, 450, 30);
        playerScoreLabel.setFont(new Font("Dialog", Font.BOLD, 26));
        playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScoreLabel);

        // Botão para escolha "Pedra"
        rockButton = new JButton("Pedra");
        rockButton.setBounds(40, 387, 105, 81); // Posição e tamanho
        rockButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        rockButton.addActionListener(this); // Escuta cliques e chama actionPerformed
        add(rockButton);

        // Botão para escolha "Tesoura"
        scissorButton = new JButton("Tesoura");
        scissorButton.setBounds(165, 387, 105, 81);
        scissorButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        scissorButton.addActionListener(this);
        add(scissorButton);

        // Botão para escolha "Papel"
        paperButton = new JButton("Papel");
        paperButton.setBounds(290, 387, 105, 81);
        paperButton.setFont(new Font("Dialog", Font.PLAIN, 18));
        paperButton.addActionListener(this);
        add(paperButton);
    }

    // Método que mostra uma janela de resultado após cada jogada
    private void showDialog(String message) {
        // Cria uma janela modal (bloqueia interação com a principal)
        JDialog resultDialog = new JDialog(this, "Resultado", true);
        resultDialog.setSize(227, 200); // Tamanho da janela
        resultDialog.setLayout(new BoxLayout(resultDialog.getContentPane(), BoxLayout.Y_AXIS)); // Layout vertical
        resultDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Fecha ao clicar no "X"
        resultDialog.setResizable(false); // Impede redimensionamento

        // Mensagem do resultado (ganhou, perdeu, empatou)
        JLabel resultLabel = new JLabel(message); 
        resultLabel.setFont(new Font("Dialog", Font.PLAIN, 18)); 
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza texto
        resultLabel.setAlignmentX(CENTER_ALIGNMENT); // Alinha no painel

        // Botão para reiniciar a rodada
        JButton tryAgainButton = new JButton("Tente novamente");
        tryAgainButton.setAlignmentX(CENTER_ALIGNMENT);
        tryAgainButton.addActionListener(e -> {
            computerChoice.setText("?"); // Reseta o símbolo do computador
            resultDialog.dispose(); // Fecha o diálogo
        });

        // Adiciona espaços visuais (margem entre os elementos)
        resultDialog.add(Box.createVerticalStrut(20)); // Espaço acima
        resultDialog.add(resultLabel); // Mensagem do resultado
        resultDialog.add(Box.createVerticalStrut(20));
        resultDialog.add(tryAgainButton); // Botão
        resultDialog.add(Box.createVerticalStrut(20)); // Espaço abaixo

        resultDialog.setLocationRelativeTo(this); // Centraliza no JFrame principal
        resultDialog.setVisible(true); // Mostra o diálogo
    }

    // Método que é chamado automaticamente quando um botão é clicado
    @Override
    public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand(); // Pega o texto do botão clicado

        // Chama o método de lógica do jogo e obtém o resultado da rodada
        String result = pedrapapeltesoura.playPedraPapelTesoura(playerChoice);

        // Atualiza na tela a escolha do computador
        computerChoice.setText(pedrapapeltesoura.getComputerChoice());

        // Atualiza o placar do computador e do jogador
        computerScoreLabel.setText("Computador: " + pedrapapeltesoura.getComputerScore());
        playerScoreLabel.setText("Jogador: " + pedrapapeltesoura.getPlayerScore());

        // Exibe a janela com o resultado
        showDialog(result);
    }

    // Método principal: inicia o aplicativo e a interface gráfica
    public static void main(String[] args) {
        new PedraPapelTesouraGUI(); // Cria e exibe a janela do jogo
    }
}