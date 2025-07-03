public class TestaConta {
    public static void main(String[] args) {
        // Exercício 2: Criando e testando a conta
        Conta conta1 = new Conta("João Silva", 12345, "067-8", "01/01/2023");
        conta1.deposita(1000);
        conta1.saca(300);
        
        System.out.println("=== Dados da Conta 1 ===");
        System.out.println(conta1.recuperaDadosParaImpressao());
        
        // Exercício 4: Comparando duas contas diferentes com mesmo conteúdo
        Conta c1 = new Conta("Danilo", 111, "001", "01/01/2023");
        c1.deposita(100);
        
        Conta c2 = new Conta("Danilo", 111, "001", "01/01/2023");
        c2.deposita(100);
        
        System.out.println("\n=== Comparação de Contas ===");
        if (c1 == c2) {
            System.out.println("As contas são iguais (comparação com ==)");
        } else {
            System.out.println("As contas são diferentes (comparação com ==)");
        }
        
        // Exercício 5: Duas referências para a mesma conta
        Conta c3 = new Conta("Hugo", 222, "002", "02/02/2023");
        c3.deposita(100);
        
        Conta c4 = c3;
        
        System.out.println("\n=== Referências para a Mesma Conta ===");
        if (c3 == c4) {
            System.out.println("c3 e c4 referenciam a mesma conta (comparação com ==)");
        } else {
            System.out.println("c3 e c4 referenciam contas diferentes");
        }
        
        // Demonstração do efeito de ter duas referências para o mesmo objeto
        c4.deposita(50);
        System.out.println("\nSaldo de c3 após depositar em c4: R$ " + c3.getSaldo());
    }
}