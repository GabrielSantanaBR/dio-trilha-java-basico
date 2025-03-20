public class FunçãoComRetorno {

    // Função que soma dois números e retorna o resultado
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Chamando a função e armazenando o resultado
        int resultado = somar(5, 3);
        System.out.println("Resultado da soma: " + resultado); // Saída: 8
    }
}