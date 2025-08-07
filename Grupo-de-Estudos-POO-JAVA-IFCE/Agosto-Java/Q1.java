package br.com.caelum.contas.modelo;

public abstract class Conta {
    
    // Problema: Como permitir que classes filhas acessem o saldo?
    // Solução: Alterar a visibilidade de 'private' para 'protected'.
    protected double saldo;
    private String titular;
    private int numero;
    private String agencia;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    // Problema: O método 'saca' de cada conta tem um comportamento diferente.
    // Solução: Torná-lo abstrato. Assim, cada subclasse deve implementar sua própria lógica.
    public abstract void saca(double valor);

    public void transfere(double valor, Conta destino) {
        // Problema: Como transferir valor entre contas?
        // Solução: O método 'saca' da conta de origem e 'deposita' na conta de destino.
        // O polimorfismo garante que o 'saca' correto será chamado (com taxa para CC, sem taxa para CP).
        this.saca(valor);
        destino.deposita(valor);
    }
    
    // Problema: A lista de contas precisa saber o tipo de cada conta.
    // Solução: Adicionar um método 'getTipo' que será sobrescrito nas subclasses.
    public String getTipo() {
        return "Conta";
    }

    // Getters e setters
    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }
}