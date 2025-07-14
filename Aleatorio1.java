public class Aleatorio1 {

    public static void main(String[] args) {
        System.out.println("Genera 10 números aleatorios");

        for (int i = 1; i <= 20; i++) {
            System.out.println((int) (Math.random() * 11) + 20);
            // nuemros entre 20 y 45
        }
    }
}