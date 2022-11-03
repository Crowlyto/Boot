public class SmartDevice {
    String marca;
    String modelo;
    double precio;


    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

