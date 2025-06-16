package Ejercicios3;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que pida dos números y 
         * que luego muestre el resultado de su multiplicación.
         */
        int n1, n2;
        
        System.out.println("ingresa el primer numero: ");
        n1 = Integer.parseInt(System.console().readLine());
        
        System.out.println("ingresa el segundo numero: ");
        n2 = Integer.parseInt(System.console().readLine());

        int multiplicación = n1 * n2;

        System.out.println("El resultado es: " + multiplicación);
        

        
    }
}
