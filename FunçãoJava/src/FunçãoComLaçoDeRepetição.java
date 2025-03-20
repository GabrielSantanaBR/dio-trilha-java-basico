public class FunçãoComLaçoDeRepetição {
    
    // Função que exibe os números de 1 a N
    public static void exibirNumeros(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Pular linha após o loop
    }

    public static void main(String[] args) {
        // Chamando a função
        exibirNumeros(10); // Saída: 1 2 3 4 5
    }
}
