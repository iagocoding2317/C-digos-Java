public class MainHelicoptero {
    public static void main(String[] args) {
        Helicoptero h1 = new Helicoptero(10); 
        Helicoptero h2 = new Helicoptero(9);  

        h1.setAltura(500); 
        h2.setAltura(300);

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

        h1.decolar();
        h2.decolar();

        System.out.println(h1);
        System.out.println(h2);

        h1.aterrissar();
        h2.aterrissar();

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
