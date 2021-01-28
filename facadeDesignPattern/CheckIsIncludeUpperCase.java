package facadeDesignPattern;

public class CheckIsIncludeUpperCase extends AbstractPasswordChecker {
    @Override
    public boolean check(String pw) {
        if(pw.matches("(?=.*[A-Z]).+$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Password en az bir büyük harf içermelidir.";
    }
}
