public class PrimitivosFloat {


    public static void main(String[] args) {

        float realFloat = 1.5e-10F; //2120F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);

        System.out.println(" ");

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Doble corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("Máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416F;
        System.out.println("varFlotante = " + varFlotante);
    }

}
