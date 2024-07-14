import java.util.Arrays;
import java.util.Random;

public class calculandoPromedio {
    public static void main(String[] args) {
        float[] array = new float[20];
        Random random = new Random();

        for ( int i = 0; i < array.length; i++) {
            array[i] = random.nextFloat(100);
        }

        float suma = 0 ;
        for (float num : array) {
            suma += num;
        }
        System.out.println("El array generado es: " + Arrays.toString(array));
        System.out.println("La suma de todos los elementos es: "+suma);
        System.out.println("El promedio de los elementos es: " +suma/array.length);
    }
}
