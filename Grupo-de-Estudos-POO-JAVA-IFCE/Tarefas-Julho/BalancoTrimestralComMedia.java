public class BalancoTrimestralComMedia {
    public static void main(String[] args) {
        final int GASTOS_JANEIRO = 15000;
        final int GASTOS_FEVEREIRO = 23000;
        final int GASTOS_MARCO = 17000;
        final int MESES_TRIMESTRE = 3;
        
        int gastosTrimestre = GASTOS_JANEIRO + GASTOS_FEVEREIRO + GASTOS_MARCO;
        double mediaMensal = (double) gastosTrimestre / MESES_TRIMESTRE;
        
        System.out.println("RELATÓRIO FINANCEIRO - 1º TRIMESTRE");
        System.out.println("-----------------------------------");
        System.out.println("Janeiro: R$ " + GASTOS_JANEIRO);
        System.out.println("Fevereiro: R$ " + GASTOS_FEVEREIRO);
        System.out.println("Março: R$ " + GASTOS_MARCO);
        System.out.println("-----------------------------------");
        System.out.println("Total trimestral: R$ " + gastosTrimestre);
        System.out.printf("Média mensal: R$ %.2f%n", mediaMensal);
    }
}