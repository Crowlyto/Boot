
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un precio a agregar IVA");
        int precio= leer.nextInt();
        System.out.println("El precio es $: "+precio+"\nEl precio con el IVA agregado es $: "+agregarIva(precio));
    }
    public static double agregarIva(int precio){
        double resultado=precio*1.21;
        return resultado;

    }
}
