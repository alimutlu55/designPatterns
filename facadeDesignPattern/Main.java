package facadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        SignUpValidityFacade signUpValidityFacade = new SignUpValidityFacade("Happy55","Happy!55","Abc55");
        System.out.println(signUpValidityFacade.checkValidity());
        System.out.println(signUpValidityFacade.getErrorMessage());

    }
}
