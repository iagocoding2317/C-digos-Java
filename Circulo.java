public class Circulo {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return 3.141516 * raio * raio;
    }

    public double calcularPerimetro() {
        return 3.141516 * 2 * raio;
    }

    public void imprimir() {
        System.out.printf("Raio: %d, Área: %.2f, Perímetro: %.2f%n", raio, calcularArea(), calcularPerimetro());
    }
}
