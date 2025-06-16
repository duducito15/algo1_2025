package Ejercicios3;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*
         * Realiza un conversor de euros a soles. La cantidad de euros 
         * que se quiere convertir debe ser introducida por teclado.
         */
        double euros, soles, factorConversion;

        factorConversion = 4.21;
        
        System.out.println("Ingresa el monto en Euros: ");
        euros = Double.parseDouble(System.console().readLine());
        soles = factorConversion * euros;

        System.out.println("La cantida de Euros en soles es: "+soles);
    }
}