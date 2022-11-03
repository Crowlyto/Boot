import java.util.Scanner;

public class SmartMain {
    //En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
    //Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    //Crear constructor vacío y con todos los parámetros para cada clase.
    //Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
    public static void main(String[] args) {
        SmartService service = new SmartService();
        SmartPhone one = new SmartPhone();
        SmartWatch two = new SmartWatch();
        System.out.println("VAMOS A CARGAR DATOD DE DOS DISPOSITOVOS\n" +
                "=============================================");
        service.ingresarTipo(one, two);
        service.mostrarDatos(one, two);

    }
}
