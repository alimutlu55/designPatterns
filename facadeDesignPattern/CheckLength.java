package facadeDesignPattern;

public class CheckLength extends AbstractCheckUserName {
    @Override
    public boolean check(String userName) {
        if(userName.length()<15) return true;
        setErrorMessage();
        return false;
    }
    @Override
    void setErrorMessage() {
        errorMessage = "Kullanıcı adı en fazla 15 karakterli olabilir.";
    }

}
