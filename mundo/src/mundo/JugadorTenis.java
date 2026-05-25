package mundo;

public class JugadorTenis {

    // Atributos
    private String nombre;
    private int edad;
    private double altura;
    private int ranking;
    private String pais;

    // Constructores
    public JugadorTenis() {}

    public JugadorTenis(String nombre, int edad, double altura, int ranking, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.ranking = ranking;
        this.pais = pais;
    }

    // Sobrecarga
    public JugadorTenis(String nombre, int ranking) {
        this.nombre = nombre;
        this.ranking = ranking;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public int getRanking() { return ranking; }
    public void setRanking(int ranking) { this.ranking = ranking; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    // Métodos
    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    public void jugarPartido() {
        System.out.println(nombre + " está jugando un partido.");
    }

    public void ganarPunto() {
        System.out.println(nombre + " ganó un punto.");
    }

    public int subirRanking() {
        return ranking - 1;
    }

    public void mostrarDatos() {
        System.out.println("Jugador: " + nombre);
    }

    // Sobrecarga
    public void mostrarDatos(String mensaje) {
        System.out.println(mensaje + " " + nombre);
    }
}
