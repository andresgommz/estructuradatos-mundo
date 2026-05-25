package mundo;

public class JugadorBasketball {

    // Atributos
    private String nombre;
    private int edad;
    private double altura;
    private String equipo;
    private int puntos;

    // Constructores
    public JugadorBasketball() {}

    public JugadorBasketball(String nombre, int edad, double altura, String equipo, int puntos) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.equipo = equipo;
        this.puntos = puntos;
    }

    // Sobrecarga
    public JugadorBasketball(String nombre, String equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public String getEquipo() { return equipo; }
    public void setEquipo(String equipo) { this.equipo = equipo; }

    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }

    // Métodos
    public void entrenar() {
        System.out.println(nombre + " está entrenando basketball.");
    }

    public void anotar() {
        puntos += 2;
    }

    public void defender() {
        System.out.println(nombre + " está defendiendo.");
    }

    public int totalPuntos() {
        return puntos;
    }

    public void mostrarJugador() {
        System.out.println("Jugador: " + nombre);
    }

    // Sobrecarga
    public void mostrarJugador(String mensaje) {
        System.out.println(mensaje + " " + nombre);
    }
}
