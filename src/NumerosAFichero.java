import java.util.List;
import java.util.Scanner;

public class NumerosAFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica un número");
        int numero = sc.nextInt();
        sc.close();

        // Genera las líneas según el número introducido
        List<String> lista = GenerarLineas.generarLineas(numero);

        // Escribe las líneas en el fichero
        GeneradorFichero.generadorFichero(lista);
    }
}