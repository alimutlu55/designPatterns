package facadeDesignPattern;

public abstract class AbstractPasswordChecker {
    String errorMessage ="";
    abstract boolean check(String pw);
    abstract void setErrorMessage();
}
