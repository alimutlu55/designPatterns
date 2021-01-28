package singletonExample;

public class Main {
    public void deneme (){
        staticdeneme();
    }

    public  void staticdeneme (){

    }
    public static void main(String[] args) {

        Product urun = Product.getInstance(1, "Çikolata");
           System.out.println(urun.getId() + " " + urun.getName() + Product.count);
        Product urun2 = Product.getInstance(2, "Pasta");
           System.out.println(urun2.getId() + " " + urun2.getName() + Product.count);

           String asd = "sad";

    }
}
