public class PrincipalCal {
    public static void main(String[] args) {
    
        Calendario c1 = new Calendario(21, 5, 2024);
        Calendario c2 = new Calendario(20, 8, 2023);

        
        c1.mostrarData();
        c1.anoBissexto();

        System.out.println(); 

        c2.mostrarData();
        c2.anoBissexto();
    }
}
