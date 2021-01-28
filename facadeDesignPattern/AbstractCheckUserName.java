package facadeDesignPattern;

public abstract class AbstractCheckUserName {
    String errorMessage;
    abstract void setErrorMessage();
    abstract boolean check(String userName);
}
