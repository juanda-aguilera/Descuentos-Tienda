import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        carrito.agregar(new Producto("Audifonos", 120000, 1));
        carrito.agregar(new Producto("Cuaderno", 8500, 4));
        carrito.agregar(new Producto("Morral", 95000, 1));

        System.out.println("Subtotal:     " + pesos(carrito.getSubtotal()));

        carrito.setEstrategia(new BlackFriday());
        System.out.println("Black Friday: " + pesos(carrito.calcularTotal()));

        carrito.setEstrategia(new DescuentoEstudiante());
        System.out.println("Estudiante:   " + pesos(carrito.calcularTotal()));

        carrito.setEstrategia(new BonoFijo());
        System.out.println("Bono 20 mil:  " + pesos(carrito.calcularTotal()));
    }

    static String pesos(double valor) {
        return String.format(Locale.forLanguageTag("es-CO"), "$%,.0f", valor);
    }
}
