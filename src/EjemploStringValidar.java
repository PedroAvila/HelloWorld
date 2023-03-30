public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "Programación Java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        if(!curso.isBlank()) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

//        if (!curso.isEmpty()) {
//            System.out.println(curso.toUpperCase());
//            System.out.println("Bienvenido al curso ".concat(curso));
//        }

    }
}

