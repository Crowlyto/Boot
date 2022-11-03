public class SmartPhone extends SmartDevice{
    double pantalla;
    double peso;

    public SmartPhone() {

    }

    public SmartPhone(double pantalla, double peso) {
        this.pantalla = pantalla;
        this.peso = peso;
    }

    public SmartPhone(String marca, String modelo, int precio, double pantalla, double peso) {
        super(marca, modelo, precio);
        this.pantalla = pantalla;
        this.peso = peso;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
