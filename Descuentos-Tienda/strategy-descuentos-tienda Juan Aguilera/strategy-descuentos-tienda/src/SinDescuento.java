public class SinDescuento implements EstrategiaDescuento {
    @Override
    public double aplicar(double subtotal) {
        return subtotal;
    }
}
