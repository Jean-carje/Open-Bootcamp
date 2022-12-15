public class App {
    public static void main(String[] args) throws Exception {
        // if ejercicio
        int numeroIf = 5;
        if (numeroIf == 0) {
            System.out.println("numeroIf es 0");
        } else if (numeroIf > 0) {
            System.out.println("numeroIf es Positivo");
        } else {
            System.out.println("numeroIf es Negativo");
        }

        // while ejercicio
        int numeroWhile = -1;
        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        // do-while ejercicio
        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
        {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        // for ejercicio
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // switch
        String estacion = "invierno";
        switch (estacion) {
            case "primaver":
                System.out.println("Primavera");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Verano");
                break;
        }
    }
}
