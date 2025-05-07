public class Retangulo {
    private int largura;
    private int comprimento;

    public Retangulo(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }
    public int calcularArea() {
        return largura * comprimento;
    }
    public int calcularPerimetro(){
        return (2 * largura + 2 * comprimento);
    }
    public void imprimir(){
        System.out.printf("Largura: %d, Comprimento: %d, Área: %d, Perímetro: %d%n", largura, comprimento, calcularArea(), calcularPerimetro());
 }
}
