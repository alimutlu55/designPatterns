package facadeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class PasswordChecker {
    List<AbstractPasswordChecker> iPasswordCheckerList = new ArrayList<>();
    StringBuilder errorMessages = new StringBuilder();

    public PasswordChecker() {
        iPasswordCheckerList.add(new CheckIsIncludeDigit());
        iPasswordCheckerList.add(new CheckIsIncludeLowerCase());
        iPasswordCheckerList.add(new CheckIsIncludeSpecialChr());
        iPasswordCheckerList.add(new CheckIsIncludeUpperCase());
    }

    public boolean check(String pw){
        boolean result = true;
        for(AbstractPasswordChecker abstractPasswordChecker:iPasswordCheckerList){
            if(!abstractPasswordChecker.check(pw)) {
                errorMessages.append(abstractPasswordChecker.errorMessage);
                result = false;
            }
        }
        return result;
    }
}
