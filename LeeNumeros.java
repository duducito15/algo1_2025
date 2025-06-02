public class LeeNumeros {
    public static void main(String[] args) {
        //
        String linea;
        //Mensaje
        System.out.println("Ingrese un número entero: ");
        //
        linea= System.console().readLine();
        //
        double numero1;
        numero1 = Double.parseDouble(linea);

        System.out.println("Ingresa otro número: ");
        linea= System.console().readLine();
        int numero2;
        numero2 = Integer.parseInt(linea);

        System.out.println("la suma de ambos números es: "+(numero1+numero2));
    }
}
