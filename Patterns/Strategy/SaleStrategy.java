public class SaleStrategy implements Strategy{

    @Override
    public double getPrice(Double price) {
        return price * 0.6;
    }
}