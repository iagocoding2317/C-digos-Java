public class MainHelicoptero {
    public static void main(String[] args) {
        Helicoptero h1 = new Helicoptero(10); 
        Helicoptero h2 = new Helicoptero(8);  

       
        System.out.println(h1);
        System.out.println(h2);

        h1.entrar();
        h1.entrar();
        h1.entrar();
        h1.entrar();

        h2.entrar();
        h2.entrar();
        h2.entrar();

        h1.ligar();
        h2.ligar();

        h1.decolar(300);
        h2.decolar(270);

        System.out.println(h1);
        System.out.println(h2);

        h1.aterrissar(300);
        h2.aterrissar(270);

        h1.desligar();
        h2.desligar();

        h1.sair();
        h1.sair();
        h1.sair();
        h1.sair();

        h2.sair();
        h2.sair();
        h2.sair();

        System.out.println(h1);
        System.out.println(h2);
    }
}
