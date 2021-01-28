package adapterDesingPattern;

public class Mac implements TypeCComputer {
    private boolean connector;
    @Override
    public void useTypeC() {
        connector = true;
        System.out.println("TypeC connected");
    }

    @Override
    public void recharge() {
        if(connector){
            System.out.println("Recharge started.");
            System.out.println("Recharge finished.");
        }else{
            System.out.println("Connect type-C first.");
        }
    }
}
