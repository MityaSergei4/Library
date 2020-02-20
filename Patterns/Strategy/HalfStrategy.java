public class HalfStrategy implements Strategy{

    @Override
    public double getPrice(Double price) {
        return price * 0.5;
    }
}