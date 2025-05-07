public class PrincipalF {
    public static void main(String[] args) {
        FitasdeVideo f1 = new FitasdeVideo("Fortnite: O Filme", 31.50);
        FitasdeVideo f2 = new FitasdeVideo("IFPB: O Filme", 14.00);
        FitasdeVideo f3 = new FitasdeVideo("Chrollo vs Hisoka", 50.00);

        System.out.println("Fitas disponíveis:");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.println("\nValores do aluguel:");
        System.out.println(f1.getTitulo() + " - Aluguel por 3 dias: R$ " + f1.getValorAluguel(3));
        System.out.println(f2.getTitulo() + " - Aluguel por 5 dias: R$ " + f2.getValorAluguel(5));
        System.out.println(f3.getTitulo() + " - Aluguel por 10 dias: R$ " + f3.getValorAluguel(10));
    }
}
