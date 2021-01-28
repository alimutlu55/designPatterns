package iteratorDesignPattern;

public class ProductList implements List<Product> {
    Product[] product;

    public ProductList(Product[] product) {
        this.product = product;
    }

    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(product);
    }
}
