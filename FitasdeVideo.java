public class FitasdeVideo{ 
    private String titulo;
    private double precoPorDia;

    public FitasdeVideo(String titulo, double precoPorDia) {
        this.titulo = titulo;
        this.precoPorDia = precoPorDia;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return precoPorDia * numeroDeDiasAlugada;
    }

    public String toString() {
        return "Título: " + titulo + ", Preço por dia: R$" + precoPorDia;
    }
}
