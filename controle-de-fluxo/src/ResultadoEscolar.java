public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;
        String resultado = nota >= 7 ? "Aprovados" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovados";
        System.out.println(resultado);
    }
}
