public class BalancoTrimestralComMedia {
    public static void main(String[] args) {
        // Mantendo as linhas existentes
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Gasto trimestral: R$ " + gastosTrimestre);
        
        // Adicionando o cálculo da média
        double mediaMensal = gastosTrimestre / 3.0;
        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}