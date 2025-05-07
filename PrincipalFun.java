public class PrincipalFun {
    public static void main(String[] args) {
        Funcionario f = new Funcionario(
            31,
            "Gonho",
            "103.543.237-27",
            "Rua de Giorno",
            "(21) 95477-5432",
            12,
            10000.00f
        );

        System.out.println("Dados:");
        System.out.println(f);

        f.setSalario(5600.00f); // Atualizando salário

        System.out.println("\nDados atualizados:");
        System.out.println(f);
        System.out.printf("Salário líquido: R$ %.2f\n", f.calculaSalarioLiquido());
    }
}
