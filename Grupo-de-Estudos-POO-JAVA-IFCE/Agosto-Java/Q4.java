package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.evento.Evento;

public class ManipuladorDeContas {

    private Conta conta;

    // Problema: Como criar diferentes tipos de conta a partir da tela?
    // Solução: Usar 'if/else' para verificar o tipo selecionado e instanciar a classe correta.
    public void criaConta(Evento evento) {
        String tipo = evento.getSelecionadoNoRadio("tipo");
        if (tipo.equals("Conta Corrente")) {
            this.conta = new ContaCorrente();
        } else {
            this.conta = new ContaPoupanca();
        }

        // Recupera os dados da tela e atribui à conta
        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setTitular(evento.getString("titular"));
    }

    // Problema: O método 'saca' estava com a lógica de taxa da conta-corrente.
    // Solução: O polimorfismo cuida disso. Basta chamar o método 'saca' da conta.
    // A JVM saberá qual método correto chamar em tempo de execução.
    public void saca(Evento evento) {
        double valor = evento.getDouble("valorOperacao");
        this.conta.saca(valor);
    }

    public void deposita(Evento evento) {
        double valor = evento.getDouble("valorOperacao");
        this.conta.deposita(valor);
    }

    // Problema: Como fazer a transferência entre contas?
    // Solução: O 'transfere' da classe 'Conta' já cuida da lógica. Aqui, apenas
    // pegamos os dados da tela e passamos para o método da conta.
    public void transfere(Evento evento) {
        double valor = evento.getDouble("valorTransferencia");
        Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
        this.conta.transfere(valor, destino);
    }
}