public class Quadrado {
    private int lado; // 

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }

    public int calcularPerimetro() {
        return 4 * lado;
    }

    public void imprimir() {
      
        System.out.printf("Lado: %d, Área: %d, Perímetro: %d%n", lado, calcularArea(), calcularPerimetro());
    }
}
