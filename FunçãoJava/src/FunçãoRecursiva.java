public class FunçãoRecursiva {
    
    // Função recursiva para calcular o fatorial de um número
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Chamando a função
        int resultado = fatorial(5);
        System.out.println("Fatorial de 5: " + resultado); // Saída: 120
    }
}
