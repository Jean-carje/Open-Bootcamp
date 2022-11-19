public class App {
    // funcion o metodo no void
    public static int edad(int a, int b) {
        int suma = a + b;
        // valor de retorno
        return suma;
    }

    public static String concatenar(String nombre, String apellido) {
        String conc = nombre + " " + apellido;
        return conc;
    }

    public static void main(String[] args) throws Exception {
        // funcion o metodo basica void
        System.out.println("funcion void");

        // llamar metodo
        System.out.println(edad(20, 27));
        System.out.println(concatenar("power", "rangers"));

    }
}
