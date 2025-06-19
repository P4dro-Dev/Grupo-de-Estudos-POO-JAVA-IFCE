public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000; 
        int gastosMarco = 17000;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        
        System.out.printf("Balanço Trimestral:%nJaneiro: R$ %d%nFevereiro: R$ %d%nMarço: R$ %d%nTotal: R$ %d%n",
                         gastosJaneiro, gastosFevereiro, gastosMarco, gastosTrimestre);
    }
}