public class Conditional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double nota = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) System.out.println("aa");
    }
}
