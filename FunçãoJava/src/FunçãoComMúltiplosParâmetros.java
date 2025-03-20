public class FunçãoComMúltiplosParâmetros {
    
    // Função que calcula a média de três números
    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        // Chamando a função
        double media = calcularMedia(7.5, 8.0, 9.5);
        System.out.println("Média: " + media); // Saída: 8.333...
    }
}
