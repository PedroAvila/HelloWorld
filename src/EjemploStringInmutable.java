public class EjemploStringInmutable {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);


        
        
    }

}
