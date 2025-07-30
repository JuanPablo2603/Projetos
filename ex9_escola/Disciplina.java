
package ex9_escola;

import javax.swing.JOptionPane;


public class Disciplina {
    
    private String nome;
    private int    cargaHoraria;
    private Professor professor;

    
    public Disciplina(String nome, int cargaHoraria, Professor professor){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
    
    public Disciplina(){
        this.nome = JOptionPane.showInputDialog("Digite o nome da Disciplina");
        this.cargaHoraria = Integer.parseInt(
                       JOptionPane.showInputDialog("Digite a carga horaria da Disciplina"));       
        this.professor = new Professor();    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
     public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    
    public String toString(){
        return this.nome +" - "+ this.cargaHoraria +" - "+ this.professor;
    }
}
