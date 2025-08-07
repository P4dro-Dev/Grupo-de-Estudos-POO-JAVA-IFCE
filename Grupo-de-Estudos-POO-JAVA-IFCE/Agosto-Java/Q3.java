package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

    // Problema: Contas-poupança não têm taxa de saque.
    // Solução: Sobrescrever o método 'saca' com a lógica de saque padrão.
    @Override
    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

    // Problema: A tela precisa exibir o tipo correto da conta.
    // Solução: Sobrescrever 'getTipo' para retornar "Conta Poupança".
    @Override
    public String getTipo() {
        return super.getTipo() + " Poupança";
    }
}