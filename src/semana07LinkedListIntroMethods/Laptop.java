package semana07LinkedListIntroMethods;

public class Laptop {
    private String marca;
    private String modelo;
    private int ram;

    public Laptop() {
    }

    public Laptop(String marca, String modelo, int ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" + "marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + '}';
    }
    
    
}
