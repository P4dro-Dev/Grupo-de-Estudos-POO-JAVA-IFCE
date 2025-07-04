/*
 * Grupo de Estudos: POO Java
 * Discente: [Seu Nome]
 * Curso: Técnico em Informática
 * Docente: Paulo César
 * Instituição: IFCE - Campus Tianguá
 */

/**
 * HelloWorldModificado - Versão aprimorada do clássico "Hello World"
 * Demonstra diferentes formas de exibição de mensagens no console
 */
public class HelloWorldModificado {
    
    /**
     * Método principal que executa o programa
     * @param args Argumentos da linha de comando (não utilizado neste exemplo)
     */
    public static void main(String[] args) {
        // 1. Mensagem personalizada para o IFCE Tianguá
        System.out.println("Bem-vindo ao curso de Programação Java!");
        System.out.println("IFCE - Campus Tianguá - 2024");
        
        // 2. Duas linhas independentes
        System.out.println("------ Primeira Parte ------");
        System.out.println("Linha 1: Introdução à POO");
        System.out.println("Linha 2: Fundamentos de Java");
        
        // 3. Texto com quebra de linha interna
        System.out.println("------ Segunda Parte ------\n"
                + "Linha 3: Tipos de dados\n"
                + "Linha 4: Estruturas de controle");
        
        // Bônus: Mensagem de enco
        System.out.println("\nPrograma concluído com sucesso!");
    }
}