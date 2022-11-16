public class Main {

    public static void main(String[] args) {

        System.out.println("Estudiante: " + args[0]);
        System.out.println(veredicto(args[1], args[2]));
    }

    private static String veredicto (String valor1, String valor2){
            if (valor1.equals(valor2)) {
                return ("Estudias 1 hora por modulo");
            } else if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
                System.out.println("Estudias poco tiempo");
            } else if (Integer.valueOf(valor1) > Integer.valueOf(valor2)) {
                System.out.println("Bien, mas de 1 hora por modulo");
            }
            return " " ;
    }
}
