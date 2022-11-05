package Ejercicio_9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class MainPropio {

    static ArrayList<Persona> Personas = new ArrayList<Persona>();
    public static void main(String[] args) throws InputMismatchException {

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("ELIJA OPCION\n" +
                    "1-AGREGAR\n" +
                    "2-MOSTRAR PERSONAS CARGADAS\n" +
                    "3-ELIMINAR\n" +
                    "4-SALIR\n");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    agregar(crearPersona());
                    break;
                case 2:
                    mostrarPersona();
                    break;
                case 3:
                    eliminarPersona();
                    break;
                case 4:
                    System.out.println("Usted a salido");
                    break;
            }
        }while (opcion != 4) ;

        System.out.println("Ingrese solo datos numéricos");

        try{
            int num1=read.nextInt();
            int num2=read.nextInt();
            int num3=read.nextInt();
            System.out.println("El resultado de la suma de los numeros ingresados es: "+resultado(num1,num2,num3));
        }catch (InputMismatchException e){
            System.out.println("Error de ingreso de datos");
        }finally {
            System.out.println("Pasamos Igual");
        }

        HashMap<Integer, String> mapita=new HashMap<Integer, String>();
        System.out.println("Ingrese DNI(como key) y nombre como value");
        mapita.put((read.nextInt()), (read.next()));
        System.out.println("Otro mas");
        mapita.put((read.nextInt()), (read.next()));
        System.out.println("Otro mas");
        mapita.put((read.nextInt()), (read.next()));
        System.out.println("Otro mas");
        mapita.put((read.nextInt()), (read.next()));
        System.out.println("Listo");

        for (Map.Entry aux: mapita.entrySet()){
            System.out.println(aux.getKey());
            System.out.println(aux.getValue());
        }
        String ficheroIn="fichero1";
        String ficheroOut="fichero2";
        try{
            InputStream entrada = new FileInputStream(ficheroIn);
            byte[] data = entrada.readAllBytes();
            entrada.close();
            PrintStream salida = new PrintStream(ficheroOut);
            salida.print(data);
            salida.close();
        }catch (Exception e){
            System.out.println("Algo anda mal");
        }


    }

    public static Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona = new Persona();
        System.out.println("Vamos a ingresar datos de la Persona\n--------------------------");
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingrese su apodo");
        persona.setApodo(leer.next());
        System.out.println("Ingrese su edad");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese su DNI");
        persona.setDNI(leer.nextInt());
        return persona;
    }
    public static void agregar(Persona one){
        Personas.add(one);

    }
    public static void mostrarPersona(){
        for (Persona aux : Personas) {
            System.out.println(aux);
            }
    }
    public static void eliminarPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre del alumno a eliminar");
        String eliminado=leer.next();
        for (int i = 0; i < Personas.size(); i++) {
            if (Personas.get(i).getNombre().equals(eliminado)) {
                Personas.remove(i);
            }
        }
    }
    public static int resultado(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


}
