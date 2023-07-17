public class LimparConsole {
    /**
     * Limpa o console exibido na saída padrão.
     */
    public static void limparConsole() {
        try {
            // Verifica o sistema operacional
            if (System.getProperty("os.name").contains("Windows")) {
                // Se for Windows, executa o comando "cls" no prompt de comando
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Caso contrário, utiliza sequências de caracteres especiais para limpar o console
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            // Em caso de exceção, imprime o rastreamento de pilha do erro
            ex.printStackTrace();
        }
    }
}
