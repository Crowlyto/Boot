import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class OtroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String ficheroEntrada = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String ficheroSalida = scanner.nextLine();
        copiarArchivo(ficheroEntrada, ficheroSalida);
    }
    public static void copiarArchivo(String ficheroEntrada, String ficheroSalida){
       try{
        InputStream entrada = new FileInputStream(ficheroEntrada);
        byte[] data = entrada.readAllBytes();
        entrada.close();
           PrintStream salida = new PrintStream(ficheroSalida);
           salida.print(data);
           salida.close();
        }catch (Exception e){
           System.out.println("Algo anda mal");
       }
    }

}
