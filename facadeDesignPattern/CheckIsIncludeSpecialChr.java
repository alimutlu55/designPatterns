package facadeDesignPattern;

public class CheckIsIncludeSpecialChr extends AbstractPasswordChecker {
    @Override
    public boolean check(String pw) {
        if(pw.matches("^(?=.*[@#$%^!&+=]).+$")) return true;
        setErrorMessage();
        return false;
    }

    @Override
    void setErrorMessage() {
        errorMessage = "Password en az bir özel karakter içermelidir.";
    }
}
