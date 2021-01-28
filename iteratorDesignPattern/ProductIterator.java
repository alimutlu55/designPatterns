package iteratorDesignPattern;

public class ProductIterator implements Iterator<Product> {
    Product[] products;
    int currenproductIndex = 0;

    public ProductIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public Product next() {
        return products[currenproductIndex++];
    }

    @Override
    public Product current() {
        return products[currenproductIndex];
    }

    @Override
    public boolean hasNext() {
        if(currenproductIndex >= products.length){ return false; }
        return true;
    }

    @Override
    public void reset() {
        currenproductIndex = 0;
    }
}
