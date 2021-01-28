package iteratorDesignPattern;

public class Demo {
    public static void main(String[] args) {
        Product [] products = new Product[3];
        products[0] = new Product(1,"Computer");
        products[1] = new Product(2,"Mobile Phone");
        products[2] = new Product(3,"Mouse");

        List<Product> productList = new ProductList(products);

        Iterator<Product> productIterator = productList.iterator();

        while(productIterator.hasNext()){
            System.out.println(productIterator.next().getProductName());
        }
        productList.iterator();
    }
}
