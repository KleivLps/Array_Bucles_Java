import java.util.Arrays;
import java.util.Random;

public class contandoElementosPares {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("El array generado es: " + Arrays.toString(array));
        int Pares = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                Pares++;
            }
        }
        System.out.println("El total de elementos pares es: " +Pares);
    }
}
