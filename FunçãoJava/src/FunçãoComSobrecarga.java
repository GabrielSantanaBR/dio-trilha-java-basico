public class FunçãoComSobrecarga { //(Overloading)

    // Função para somar dois números inteiros
    public static int somar(int a, int b) {
        return a + b;
    }

    // Função para somar três números inteiros (sobrecarga)
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Função para somar dois números decimais (sobrecarga)
    public static double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Chamando as funções
        System.out.println("Soma de 2 e 3: " + somar(2, 3)); // Saída: 5
        System.out.println("Soma de 2, 3 e 4: " + somar(2, 3, 4)); // Saída: 9
        System.out.println("Soma de 2.5 e 3.5: " + somar(2.5, 3.5)); // Saída: 6.0
    }
}
