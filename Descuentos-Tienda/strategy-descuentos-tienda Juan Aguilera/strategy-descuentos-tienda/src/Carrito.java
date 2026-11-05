import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();
    private EstrategiaDescuento estrategia = new SinDescuento();

    public void agregar(Producto producto) {
        productos.add(producto);
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (Producto p : productos) {
            subtotal += p.getSubtotal();
        }
        return subtotal;
    }

    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal() {
        return estrategia.aplicar(getSubtotal());
    }
}
