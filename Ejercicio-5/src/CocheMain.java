import java.util.Scanner;

public class CocheMain {
    static CocheCRUD coche=new CocheCRUDImpl();

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("Ingrese una opcion\n" +
                    "1-Ingresar Datos\n" +
                    "2-Consultar Datos\n" +
                    "3-Eliminar Vehiculo\n" +
                    "4-Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    coche.save(new Coche());
                    break;
                case 2:
                    coche.finAll();
                    break;
                case 3:
            }
        }while (opcion!=4);

       coche.finAll();
       coche.delete(new Coche());
    }
}
