package Biblioteca;

public class Matematicas {

    // miSuma, retorna la suma de dos numeros enteros
    public static int miSuma(int x, int y) {
        return x + y;
    }

    // miResta, retorna la resta de dos numeros enteros
    public static int miResta(int x, int y) {
        return x - y;
    }

    // miResta, retorna la resta de dos numeros enteros
    public static int miMultiplicacion(int x, int y) {
        return x * y;
    }

    // miResta, retorna la resta de dos numeros enteros
    public static double miDivision(int x, int y) {
        if (y == 0) {
            return -1;
        } else {
            return (double)(x / y);
        }
    }
}
