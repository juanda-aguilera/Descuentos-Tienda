public class BonoFijo implements EstrategiaDescuento {
    @Override
    public double aplicar(double subtotal) {
        if (subtotal >= 150000) {
            return subtotal - 20000;
        }
        return subtotal;
    }
}
