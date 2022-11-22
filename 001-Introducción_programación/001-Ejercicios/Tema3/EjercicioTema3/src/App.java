public class App {
    public static void main(String[] args) throws Exception {
        // Primera parte
        System.out.println("Suma de tres numeros:");
        System.out.println(sum(5, 3, 10));

        // Segunda Parte
        Coche mycoche = new Coche();
        mycoche.incrementarPuertas();

        System.out.println("El numero de puertas es: " + mycoche.puertas);
    }

    public static int sum(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }
}

// Segunda parte:
class Coche {
    public int puertas = 4;

    public void incrementarPuertas() {
        this.puertas++;
    }
}