package main6; // Define o pacote onde esta classe está localizada

import java.util.Random; // Importa a classe Random para gerar escolhas aleatórias

public class PedraPapelTesoura { // Declara a classe principal do jogo

    // Array com as opções que o computador pode escolher
    private static final String[] computerChoices = {"Pedra", "Papel", "Tesoura"};

    // Variável para armazenar a escolha atual do computador
    private String computerChoice;

    // Variáveis para armazenar a pontuação do computador e do jogador
    private int computerScore, playerScore;

    // Objeto Random para gerar números aleatórios
    private Random random;

    // Construtor da classe: inicializa o objeto Random
    public PedraPapelTesoura() {
        random = new Random();
    }

    // Retorna a escolha atual do computador
    public String getComputerChoice() {
        return computerChoice;
    }

    // Retorna a pontuação atual do computador
    public int getComputerScore() {
        return computerScore;
    }

    // Retorna a pontuação atual do jogador
    public int getPlayerScore() {
        return playerScore;
    }

    // Método principal que executa a lógica do jogo
    public String playPedraPapelTesoura(String playerChoice) {
        // Escolhe aleatoriamente uma opção para o computador
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        String result; // Variável para guardar o resultado da rodada

        // Verifica se houve empate
        if (computerChoice.equals(playerChoice)) {
            result = "Empate";
        } 
        // Verifica se o jogador venceu (baseado nas regras do jogo)
        else if (
            (playerChoice.equals("Pedra") && computerChoice.equals("Tesoura")) ||
            (playerChoice.equals("Papel") && computerChoice.equals("Pedra")) ||
            (playerChoice.equals("Tesoura") && computerChoice.equals("Papel"))
        ) {
            result = "Jogador venceu"; // Define o resultado como vitória do jogador
            playerScore++; // Incrementa a pontuação do jogador
        } 
        // Se não houve empate nem vitória do jogador, então o computador venceu
        else {
            result = "Jogador perdeu"; // Resultado é derrota do jogador
            computerScore++; // Incrementa a pontuação do computador
        }

        return result; // Retorna o resultado da rodada
    }
}