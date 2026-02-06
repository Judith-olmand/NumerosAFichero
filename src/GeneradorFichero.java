import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorFichero {
    public static void generadorFichero(List<String> lineas) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))){

            for(String linea : lineas){
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Fichero 'salida.txt' generado correctamente");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " +
                    e.getMessage());
        }
    }
}