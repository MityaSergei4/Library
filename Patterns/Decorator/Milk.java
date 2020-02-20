public class Milk implements Product {
    Milk(int price) {
        this.price = price;
    }

    private final int price;

    @Override
    public int getPrice() {
        return this.price;
    }
}