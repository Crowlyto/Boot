import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //1- Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        String reves;
        StringBuilder alvere = new StringBuilder(frase);
        reves = alvere.reverse().toString();
        System.out.println("La frase original es: " + frase);
        System.out.println("La frase al reces es: " + reves);
        //2- Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] texto = {"Leandro", "Nicolas", "Felipe", "Maximiliano", "Victoria", "María"};
        for (String aux : texto) {
            System.out.println(aux);
        }
        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] numeritos={{4,10,85},{11,23,56},{5,32,25}};
        for (int i = 0; i < numeritos.length; i++) {
            for (int j = 0; j < numeritos[i].length; j++) {
                System.out.print("Fila: "+(i+1)+"\n Columna: "+(j+1)+"\n "+numeritos[i][j] + "\n-------------\n ");
            }
        }
        //3- Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        System.out.println("Vector completo:\n"+vector);
        vector.remove(2);
        vector.remove(3);
        System.out.println("Vector con 2do y 3er elemento eliminado:\n"+vector);
        //4- Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println("Sobrepasariamos la capacidad por defecto que es de 10, lo cual generaria un desperdicio de memoria del sistema; " +
                "ya que cada vez que se se sobrepasa el limite por defecto la dimension del mismo se duplica.");
        //5- Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> nombres = new ArrayList<>();
        LinkedList<String> copiaNombres = new LinkedList<>();
        nombres.add("Leandro");
        nombres.add("Nicolas");
        nombres.add("Felipe");
        nombres.add("Maximiliano");
        for (int i = 0; i < nombres.size(); i++){
            copiaNombres.add(i,nombres.get(i));
        }
        System.out.println("Valores del ArrayList de tipo String");
        for (String aux1: nombres){
            System.out.println(aux1+"");
        }
        System.out.println("Valores del LinkedList de tipo String");
        for (String aux2: copiaNombres){
            System.out.println(aux2+"");
        }
        //6- Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo
        // y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en
        // menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer>  numeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i+1);
        }
        System.out.println("Valores del ArrayList de tipo int completo");
        for (Integer aux3: numeros){
            System.out.println(aux3);
        }
        for (int i =0;i<numeros.size();i++){
            if (numeros.get(i)%2==0){
                numeros.remove(i);
            }
        }
        for (Integer aux4:numeros) {
            System.out.println(aux4);
        }
        //7-Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será
        // capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".
        System.out.println("Vamos a realizar una division");
        System.out.println("Ingrese un valor para el dividendo");
        int dividendo=(leer.nextInt());
        System.out.println("Ingrese un valor para el divisor");
        int divisor=(leer.nextInt());
        try{
            System.out.println("El resultado es: "+DividePorCero(dividendo, divisor));
        }catch (ArithmeticException e){
            System.out.println("No se puede realizar la divisio por cero");
        }finally{
            System.out.println("Demo de codigo");
        }

    }
    public static int DividePorCero(int num, int num1) throws ArithmeticException{
        return num/num1;

    }
}

