class MilkDiscount extends Decorator{

    public MilkDiscount(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return (int) (this.product.getPrice() * 0.5);
    }
}