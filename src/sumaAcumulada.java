import java.util.Arrays;

public class sumaAcumulada {
    public static void main(String[] args) {
        int[] numeros = {12,4,21,3,5,80};

        int suma = 0;
        for (int i = 0 ; i< numeros.length; i++) {
            suma += numeros[i];
            numeros[i] = suma;
        }
        System.out.println("El contenido del array sumando cada uno de sus elementos es: " +Arrays.toString(numeros));

    }
}
