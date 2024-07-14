public class valorMinimo {
    public static void main(String[] args) {

        int[] numeros = {8,10,5,3,4};
        int minimo = numeros[0];
        for (int i = 1;i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El valor minimo dentro del array es: " +minimo);
}
    }