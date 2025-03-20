public class FunçãoComEstruturasDeDecisão {
    
    // Função que verifica se um número é par ou ímpar
    public static String verificarParidade(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    public static void main(String[] args) {
        // Chamando a função
        String resultado = verificarParidade(10);
        System.out.println("O número é: " + resultado); // Saída: Par
    }
}
