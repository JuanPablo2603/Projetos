

import javax.swing.JOptionPane;
public class ExFuncionario {

   
    public static void main(String[] args) {
         Funcionario[] funcionarios = new Funcionario[3];
        
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Cadastro do " + (i+1) + "º funcionário:");
            funcionarios[i] = new Funcionario("", "", 0);
        }
        
        // Exibindo dados de todos os funcionários
        String dados = "=== DADOS DOS FUNCIONÁRIOS ===\n";
        
        for (Funcionario func : funcionarios) {
            dados += "\nNome: " + func.getNome() +
                     "\nCargo: " + func.getcargo() +
                     "\nSalário: R$ " + func.getSalário() +
                     "\n-----------------------";
        }
        
        JOptionPane.showMessageDialog(null, dados);
        
        // Comparando salários com R$ 5000,00
        JOptionPane.showMessageDialog(null, "=== COMPARAÇÃO COM R$ 5000,00 ===");
        
        for (Funcionario func : funcionarios) {
            JOptionPane.showMessageDialog(null, "Funcionário: " + func.getNome());
            func.comparaSalario(5000.00f);
        }
    }
}