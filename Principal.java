public class Principal {
    public static void main (String[] args){
        Aluno a1 = new Aluno("Chris", 30004 , 7.0, 5.0);
        Aluno a2 = new Aluno("Iago", 40004 , 10.0, 8.0); 
        Aluno a3 = new Aluno("Daniel", 70004 , 9.0, 9.0);

        Turma turma = new Turma(5);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        System.out.println("Listar os alunos: ");
        turma.listarAlunos();
    
        System.out.println("Buscar as matrículas: ");
        turma.buscarPorMatricula(40004);
    }
}
