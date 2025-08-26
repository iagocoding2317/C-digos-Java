public class Turma{
    private Aluno[] alunos;
    private int quantidade;

    public Turma(int quantidade){
        this.alunos = new Aluno[quantidade];
        this.quantidade = 0;
    }

    public void adicionarAluno(Aluno aluno){
        if (quantidade < this.alunos.length){
            this.alunos[this.quantidade++] = aluno;
        }
        else{
            System.out.println("Turma cheia, não é possível adicionar mais alunos.");
        }
    }

    public void listarAlunos(){
        for (Aluno aluno : alunos){
            if (aluno != null)
                aluno.exibirinfo();
        }
    }

    public Aluno buscarPorMatricula(int matricula){
        for (Aluno aluno : alunos){
            if (aluno != null && aluno.getMatricula() == matricula){
                aluno.exibirinfo();
                return aluno;
            }
        }
        return null;
    }
}
