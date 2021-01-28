package singletonExample;

public class Product {
    private long id;
    private String name;
    private String code;
    private static Product instance = null;
    public static int count =0;

    private Product(long id, String name){
        this.id = id;
        this.name = name;
        count++;
    }

    private synchronized static void createInstance(long id ,String name) {
        if (instance == null)
            instance = new Product( id, name);
    }

    public static Product getInstance(long id, String name){
        if(instance == null )
            createInstance(id,name);
      return instance;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return id + name.substring(0,1);
    }



}
