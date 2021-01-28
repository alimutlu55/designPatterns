package facadeDesignPattern;

public class CheckIsIncludeDigit extends AbstractPasswordChecker {
    @Override
    public boolean check(String pw) {
        if(pw.matches("^(?=.*\\d).+$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Password en az bir rakam içermelidir.";
    }
}
