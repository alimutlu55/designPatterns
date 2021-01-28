package facadeDesignPattern;

public class CaptchaChecker{
    private String validCaptcha ="Abc55";
    String errorMessage = "";

    public boolean check(String captcha) {
        if(captcha.equals(validCaptcha)) return true;
        errorMessage = "Captcha yanlış girildi";
        return false;
    }
}
