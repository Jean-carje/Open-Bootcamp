public class App {
    public static int sum(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Suma de tres numeros:");
        System.out.println(sum(5, 3, 10));
    }
}
