public class SmartWatch extends SmartDevice{
    String tipo;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, int precio, String tipo) {
        super(marca, modelo, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
