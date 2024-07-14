import java.util.Arrays;

public class invertirArray {
    public static void main(String[] args) {
        int[] numeros = {10, 8, 9, 4 ,25};

        for (int i = 0; i<numeros.length / 2; i++) {
            int aux = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = aux;
        }
        System.out.println("El contenido del array es: " +Arrays.toString(numeros));
    }
}
