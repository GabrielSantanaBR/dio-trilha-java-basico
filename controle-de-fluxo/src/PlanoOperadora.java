public class PlanoOperadora {
    public static void main(String[] args) {
       String plano = "T"; // M / T

       switch (plano){
           case "T":
               System.out.println("5Gb de Youtube");
           case "M":
               System.out.println("WhatsApp e Instragram grátis");
           case "G":
               System.out.println("100 minutos de ligação");
       }
       
       /**if(plano == "B") {
        System.out.println("100 minutos de ligação");
         } else if(plano == "M") {
        System.out.println("100 minutos de ligação");
        System.out.println("WhatsApp e Instragram grátis");
         } else if(plano == "G") {
            System.out.println("100 minutos de ligação");
        System.out.println("WhatsApp e Instragram grátis");
        System.out.println("5GB Youtube e Netflix");
       }
    }*/
}
}
