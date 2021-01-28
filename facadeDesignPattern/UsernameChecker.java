package facadeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class UsernameChecker {
    List<AbstractCheckUserName> abstractCheckUserNameList = new ArrayList<>();
    StringBuilder errorMessage = new StringBuilder();

    public UsernameChecker() {
        abstractCheckUserNameList.add(new CheckLength());
        abstractCheckUserNameList.add(new CheckRegex());
    }

    public boolean check(String userName){
        boolean result = true;
        for(AbstractCheckUserName abstractCheckUserName : abstractCheckUserNameList){
            if(!abstractCheckUserName.check(userName)){
                errorMessage.append(abstractCheckUserName.errorMessage);
                result = false;
            }
        }
        return result;
    }
}
