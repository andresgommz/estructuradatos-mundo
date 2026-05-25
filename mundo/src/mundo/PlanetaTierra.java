package mundo;

public class PlanetaTierra {

    // Atributos 
    private String nombre;
    private double radio;
    private double masa;
    private int poblacion;
    private boolean tieneAgua;

    // Constructores
    public PlanetaTierra() {
    }

    public PlanetaTierra(String nombre, double radio, double masa, int poblacion, boolean tieneAgua) {
        this.nombre = nombre;
        this.radio = radio;
        this.masa = masa;
        this.poblacion = poblacion;
        this.tieneAgua = tieneAgua;
    }

    // Sobrecarga
    public PlanetaTierra(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    public double getMasa() { return masa; }
    public void setMasa(double masa) { this.masa = masa; }

    public int getPoblacion() { return poblacion; }
    public void setPoblacion(int poblacion) { this.poblacion = poblacion; }

    public boolean isTieneAgua() { return tieneAgua; }
    public void setTieneAgua(boolean tieneAgua) { this.tieneAgua = tieneAgua; }

    // Métodos
    public void rotar() {
        System.out.println("El planeta está rotando.");
    }

    public void orbitar() {
        System.out.println("El planeta está orbitando el sol.");
    }

    public double calcularGravedad() {
        return 9.8;
    }

    public void mostrarInfo() {
        System.out.println("Planeta: " + nombre);
    }

    public boolean esHabitable() {
        return tieneAgua;
    }

    // Sobrecarga
    public void mostrarInfo(String mensaje) {
        System.out.println(mensaje + " " + nombre);
    }
}
