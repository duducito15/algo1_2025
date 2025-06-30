public class CuentaPositivos {
    public static void main(String[] args) {
        System.out.println("Ingrese números y pulse INTRO");
        System.out.println("para terminar ingrese un número negativo. ");

        int cuentaNumeros = 0;
        int numeroIngresado = 0;
        int suma = 0;

        while (numeroIngresado >= 0) {
            numeroIngresado = Integer.parseInt(System.console().readLine());
            cuentaNumeros++; // cantidad de numeros ingresados
            suma = suma + numeroIngresado; // suma de los numeros ingresados
        }

        System.out.println("Has ingresado " + (cuentaNumeros - 1) + " números positivos");
        System.out.println("La suma total de ellos es " + (suma - numeroIngresado));
    }
}
