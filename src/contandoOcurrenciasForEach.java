import java.util.Scanner;

public class contandoOcurrenciasForEach {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escribe una frase porfavor: ");
            String frases = scanner.nextLine();
            char [] frasesArray = frases.toCharArray();

            System.out.println("Ingrese el caracter a buscar: ");
            char caracterObjetivo = scanner.next().charAt(0);

            int contador = 0;
            for (char c: frasesArray) {
                if (c == caracterObjetivo) {
                    contador++;
                }
            }
            if (contador > 0) {
                System.out.printf("El caracter \"%c\" aparece %d veces. \n", caracterObjetivo, contador ) ;
            } else {
                System.out.printf("El caracter \"%c\" no aparece en la frase. \n", caracterObjetivo);
            }
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }


    }
}
