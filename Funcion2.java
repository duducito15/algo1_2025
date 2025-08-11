public class Funcion2 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Programa que suma dos números enteros");
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.print("la suma es: " + miSuma(num1, num2));
    }

    public static int miSuma(int x, int y) {
        return x + y;
    }
}
