package facadeDesignPattern;

public class CheckIsIncludeLowerCase extends AbstractPasswordChecker {
    @Override
    public boolean check(String pw) {
        if(pw.matches("^(?=.*[a-z]).+$")) return true;
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Password en az bir küçük harf içermelidir.";
    }
}
