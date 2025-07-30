import javax.swing.JOptionPane;
public class Funcionario {
    private double Salário;
    private String Nome;
    private String cargo;
    
    public Funcionario(String Nome, String cargo, double Salário){
        this.Salário= Integer.parseInt(JOptionPane.showInputDialog("DIGITE O SALARIO DO FUNC "));
        this.Nome = JOptionPane.showInputDialog("Digite o nome dele ");
        this.cargo = JOptionPane.showInputDialog("Digite o seu cargo ");
    }
    public double getSalário(){
        return Salário;
    }
    public void setSalário(double Salário){
        this.Salário = Salário;
        
    }
    public String getNome(){
        return Nome;
    }
    public void setNome(String Nome){
        this.Nome= Nome;
    }
    public String getcargo(){
        return cargo;
    }
    public void setcargo(String cargo){
        this.cargo= cargo;
    }
     public void comparaSalario(float valor) {
        if (this.Salário > valor) {
            JOptionPane.showMessageDialog(null, "O salário do funcionario é maior que " + valor);
        } else if (this.Salário < valor) {
            JOptionPane.showMessageDialog(null,"O salário do funcionário é MENOR que " + valor);
        } else {
           JOptionPane.showMessageDialog(null,"O salário do funcionário é IGUAL a " + valor);
        }
    }
}

