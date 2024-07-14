import java.util.Scanner;


public class concatenandoElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Igrese la cantidad de elementos del array: ");
        int numeros = scanner.nextInt();
        scanner.nextLine();
        String[] oraciones = new String[numeros];

        for (int i = 0; i < oraciones.length; i++ ) {
            System.out.println("Ingrese la cadena " +(i+1) + ": ");
            oraciones[i] = scanner.nextLine();
        }

        String resultados = "";
        for (String palabra : oraciones) {
            resultados = resultados + " " + palabra;
        }
        System.out.println("La cadena concatenada es: \n" + resultados);
    }

}
