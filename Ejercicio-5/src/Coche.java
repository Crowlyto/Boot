public class Coche {
    String marca;
    String modelo;
    int año;
    int puertas;

    public Coche() {
    }

    public Coche(String marca, String modelo, int año, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche\n" +
                "*Marca=" + marca + "\n" +
                "*Modelo=" + modelo + "\n" +
                "*Año=" + año +"\n"+
                "*Puertas=" + puertas ;

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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
