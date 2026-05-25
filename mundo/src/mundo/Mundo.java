package mundo;

public class Mundo {
    public static void main(String[] args) {
        // Crear objetos
        PlanetaTierra tierra = new PlanetaTierra("Tierra", 6371, 5.97, 800000000, true);
        JugadorTenis tenista = new JugadorTenis("Carlos", 20, 1.85, 5, "España");
        JugadorBasketball basquet = new JugadorBasketball("Juan", 25, 1.98, "Lakers", 30);

        // Imprimir un atributo de cada objeto
        System.out.println("Planeta: " + tierra.getNombre());
        System.out.println("Tenista: " + tenista.getNombre());
        System.out.println("Basquetbolista: " + basquet.getNombre());
    }
}
