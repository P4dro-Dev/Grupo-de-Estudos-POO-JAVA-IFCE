package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {

    // Problema: Contas-correntes precisam de uma taxa de 10 centavos no saque.
    // Solução: Sobrescrever o método 'saca' para incluir essa lógica.
    @Override
    public void saca(double valor) {
        if (this.saldo >= valor + 0.10) {
            this.saldo -= valor + 0.10;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

    // Problema: A tela precisa exibir o tipo correto da conta.
    // Solução: Sobrescrever 'getTipo' para retornar "Conta Corrente".
    @Override
    public String getTipo() {
        // Solução (opcional): Uso da palavra-chave 'super' para reutilizar o texto do pai.
        return super.getTipo() + " Corrente";
    }
}