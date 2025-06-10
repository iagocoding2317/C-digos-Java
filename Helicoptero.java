public class Helicoptero {
    private boolean estaLigado;
    private int altitude;
    private int capacidade;
    private int quantidade;


    public Helicoptero(int capacidade) {
        this.capacidade = capacidade;   
    }

    public boolean getEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void entrar() {
        if (quantidade < capacidade) {
            quantidade = quantidade + 1;
        }
    }

    public void sair() {
        if (quantidade > 0) {
            quantidade = quantidade - 1;
        }
    }

    public void ligar() {
        if (estaLigado == false) {
            estaLigado = true;
        }
    }

    public void decolar(int altura) {
        if (estaLigado && altitude == 0) {
            altitude = altitude + altura;
        }
    }

    public void aterrissar(int altura) {
        if (estaLigado && altitude > 0) {
            altitude = altitude - altura;
        }
    }

    public void desligar() {
        if (estaLigado && altitude == 0) {
            estaLigado = false;
        }
    }

    @Override
    public String toString() {
        return String.format("O helicóptero está %s, com altitude %d, capacidade %d e %d pessoas a bordo",
                estaLigado ? "ligado" : "desligado", altitude, capacidade, quantidade);
    }
}
