public class Ejercicio_3 {
    public static void main(String[] args) {
        String[] datos = {"Leandro", "Nicolas", "Nuñez"};
        String nombreCompleto = "";
        for (int i = 0; i < datos.length; i++) {
            nombreCompleto+=datos[i]+" ";
        }
        System.out.println("Mi nombre completo es: \n"+nombreCompleto);
    }
}
