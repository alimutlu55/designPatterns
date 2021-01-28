package factoryDesignPattern;

public abstract class AbstractCoffee implements Coffee{
    private int sugarCount = 0;

    public void addSugar(int sugarCount) {
        this.sugarCount = sugarCount;
        System.out.println("Şeker sayısı: " + this.sugarCount);
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }
}
