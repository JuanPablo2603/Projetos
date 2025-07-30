  
package ex9_escola;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Turma {
    private String codigo;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo) {
        this.codigo = codigo;
        this.disciplinas = new ArrayList<Disciplina>();
        this.alunos = new ArrayList<Aluno>();
    }
    
    public Turma() {
        this.codigo = JOptionPane.showInputDialog("Digite o código da Turma");
        this.disciplinas = new ArrayList<Disciplina>(); 
        this.alunos = new ArrayList<Aluno>();
    } 

    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void addAluno(Aluno a){
        this.alunos.add(a);
    }
    
    public void listarAlunos(){
        System.out.println("Aluno da Turma: "+ this.codigo);    
        
        for(Aluno a : alunos) 
            System.out.println(a);   
         
        System.out.println("------------");
    }
    
    public void addDisciplina(Disciplina d){
        this.disciplinas.add(d);
    }
    
    public void listarDisciplinas(){
        System.out.println("Disciplinas da Turma: "+ this.codigo);
        
        for(Disciplina d : disciplinas)
            System.out.println(d);
        
        System.out.println("-----------");
    }
    
    public void listarProfessores(){
        System.out.println("Professores da Turma: "+ this.codigo);
        
        for(Disciplina d : disciplinas)
            System.out.println(d.getProfessor().getNome());
        
        System.out.println("-----------");
    }
}
    

