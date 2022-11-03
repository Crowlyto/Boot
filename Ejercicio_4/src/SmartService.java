import java.util.Scanner;

public class SmartService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public void ingresarTipo(SmartPhone one, SmartWatch two){
        System.out.println("Ingrese datos del SmartPhone\n--------------------------");
            cargaDatosPhone(one);
        System.out.println("--------------------------");
        System.out.println("Ingrese datos del SmartWatch\n--------------------------");
            cargaDatosWatch(two);
    }
    public SmartPhone cargaDatosPhone(SmartPhone one){
        System.out.println("Ingrese marca");
        one.setMarca(leer.next());
        System.out.println("Ingrese modelo");
        one.setModelo(leer.next());
        System.out.println("Ingrese tamaño de pantalla en pulgadas");
        one.setPantalla(leer.nextDouble());
        System.out.println("Ingrese peso en gramos");
        one.setPeso(leer.nextDouble());
        System.out.println("Ingrese precio");
        one.setPrecio(leer.nextDouble());
        return one;
    }
    public SmartWatch cargaDatosWatch(SmartWatch two){
        System.out.println("Ingrese marca");
        two.setMarca(leer.next());
        System.out.println("Ingrese modelo");
        two.setModelo(leer.next());
        System.out.println("Ingrese tipó Clasico/Banda Deportiva");
        two.setTipo(leer.next());
        System.out.println("Ingrese precio");
        two.setPrecio(leer.nextDouble());
        return two;
    }
    public void mostrarDatos(SmartPhone one, SmartWatch two){
        System.out.println("");
        System.out.println("Informacion de SmartPhone\n" +
                "Marca: "+one.getMarca()+"\n" +
                "Modelo: "+one.getModelo()+"\n" +
                "Tamaño de pantalla: "+one.getPantalla()+"inch\n" +
                "Peso: "+one.getPeso()+"grs\n" +
                "Precio: $ "+one.getPrecio()+"\n");
        System.out.println("Informacion de SmarWatch\n" +
                "Marca: "+two.getMarca()+"\n" +
                "Modelo: "+two.getModelo()+"\n" +
                "Tipo: "+two.getTipo()+"\n" +
                "Precio: $ "+two.getPrecio()+"\n");
    }


}
