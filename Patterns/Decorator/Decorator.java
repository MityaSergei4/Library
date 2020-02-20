abstract class Decorator implements Product{
    Decorator(Product product) {
        this.product = product;
    }

    final Product product;
}