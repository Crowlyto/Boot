import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CocheCRUDImpl implements CocheCRUD{
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    List<Coche> one =new ArrayList<Coche>();

    @Override
    public void save(Coche coche) {
        System.out.println("Ingrese Marca");
        coche.setMarca(leer.next());
        System.out.println("Ingrese Modelo");
        coche.setModelo(leer.next());
        System.out.println("Ingrese año");
        coche.setAño(leer.nextInt());
        System.out.println("Ingrese cantidad de Puertas");
        coche.setPuertas(leer.nextInt());
        one.add(coche);
        System.out.println("Vehiculo guardado");
    }
    @Override
    public List<Coche> finAll() {
        System.out.println("Mostando Datos");
        for (Coche coche : one) {
            System.out.println(coche);
        }
        return one;
    }
    @Override
    public void delete(Coche coche) {
        for (int i=0;i<one.size();i++) {
            if (one.get(i)==coche) {
                one.remove(i);
                break;
            }
        }
        System.out.println("Vehiculo eliminado");

    }
}
