
package ex9_escola;

import javax.swing.JOptionPane;


public class Professor {
    private String nome;
    private String area;

    public Professor(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }
    
    public Professor() {
        this.nome = JOptionPane.showInputDialog("Digite o nome do professor");
        this.area = JOptionPane.showInputDialog("Digite a área do professor");
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    
    public String toString(){
        return this.nome;
    }
    
}
