public class Aluno{
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public String situacao(){
        if (calcularMedia() >= 7.0){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }

    public void exibirinfo(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("A matrícula do aluno é: " + matricula);
        System.out.println("As notas do aluno são: " + nota1 + " e " + nota2);
        System.out.println("A média do aluno é: " + calcularMedia());
        System.out.println("A situação do aluno é: " + situacao());
    }

    public int getMatricula(){
    return matricula;
    }

}
