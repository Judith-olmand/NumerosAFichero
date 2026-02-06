import java.util.ArrayList;
import java.util.List;

public class GenerarLineas {
    public static List<String> generarLineas(int numero){
        List<String> lineas = new ArrayList<>();

        //i --> indica la línea
        for(int i = 1; i <= numero; i++){
            //Crea un constructor de String
            StringBuilder linea = new StringBuilder();

            //j --> indica los numeros a escribir en la linea
            for(int j = 1; j <= i; j++){
                //append "pega" detras de lo que haya
                linea.append(j).append(" ");
            }

            //Convierte a texto y lo almacena en la List
            lineas.add(linea.toString());
        }
        return lineas;
    }
}