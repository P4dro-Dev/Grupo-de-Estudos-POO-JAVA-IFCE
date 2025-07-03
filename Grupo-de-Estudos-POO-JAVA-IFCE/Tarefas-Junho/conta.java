public class Conta {
    // Atributos
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    // Construtor
    public Conta(String titular, int numero, String agencia, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
        this.saldo = 0.0;
    }

    // Métodos
    public boolean saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        return "Titular: " + titular + "\n" +
               "Número: " + numero + "\n" +
               "Agência: " + agencia + "\n" +
               "Saldo: R$ " + String.format("%.2f", saldo) + "\n" +
               "Data de Abertura: " + dataAbertura + "\n" +
               "Rendimento Mensal: R$ " + String.format("%.2f", calculaRendimento());
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }
}