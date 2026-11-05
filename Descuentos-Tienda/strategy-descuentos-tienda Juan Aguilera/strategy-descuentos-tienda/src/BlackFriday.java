public class BlackFriday implements EstrategiaDescuento {
    @Override
    public double aplicar(double subtotal) {
        return subtotal * 0.80;
    }
}
