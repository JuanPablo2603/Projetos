
package ex9_escola;

import javax.swing.JOptionPane;


public class Aluno {
    
    private String nome;
    private int    idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Aluno() {
        this.nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
    }    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString(){
        return this.nome +" - "+ this.idade;
        
    }
    
}
