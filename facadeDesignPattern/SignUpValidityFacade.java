package facadeDesignPattern;

public class SignUpValidityFacade {
    private String userName;
    private String pw ;
    private String captcha;
    PasswordChecker passwordChecker;
    UsernameChecker usernameChecker;
    CaptchaChecker captchaChecker;

    public SignUpValidityFacade(String userName,String pw,String captcha) {
        this.userName = userName;
        this.pw = pw;
        this.captcha = captcha;
        passwordChecker = new PasswordChecker();
        usernameChecker = new UsernameChecker();
        captchaChecker = new CaptchaChecker();
    }

    public boolean checkValidity (){
       if(usernameChecker.check(userName) &&
                passwordChecker.check(pw) &&
                captchaChecker.check(captcha)) return true;
       return false;
    }

    public StringBuilder getErrorMessage(){
        return new StringBuilder()
                .append(usernameChecker.errorMessage)
                .append(passwordChecker.errorMessages)
                .append(captchaChecker.errorMessage);
    }


}
