
package ex9_escola;

public class Ex9_Escola {

    public static void main(String[] args) {
        Turma t1 = new Turma();
        Turma t2 = new Turma("6-Ano");
        
        Professor p2 = new Professor("Helio",   "Letras");
        Professor p3 = new Professor("Roberta", "Humanas");
        Professor p4 = new Professor("Clesio",  "Humanas");
        
        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina("Portugues",  34, p2);
        Disciplina d3 = new Disciplina("Sociologia", 24, p3);
        Disciplina d4 = new Disciplina("Filosofia",  30, p4);
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Brenda",  20);
        Aluno a3 = new Aluno("Calos",   21);
        Aluno a4 = new Aluno("Douglas", 22 );
        
        t1.addDisciplina(d1);
        t1.addDisciplina(d2);
        t2.addDisciplina(d3);
        t2.addDisciplina(d4);

        t1.addAluno(a1);
        t1.addAluno(a2);
        t2.addAluno(a3);
        t2.addAluno(a4);
        
        t1.listarDisciplinas();
        t1.listarAlunos();
        
        t2.listarDisciplinas();
        t2.listarAlunos();
        
        t1.listarProfessores();
        t2.listarProfessores();
    }
    
}
