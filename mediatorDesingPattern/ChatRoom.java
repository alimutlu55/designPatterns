package mediatorDesingPattern;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatRoom implements IChatRoom{

    Map<Integer,User> userMap = new HashMap<>();

    @Override
    public void sendMessage(String message,int userId) {
        User us = userMap.get(userId);
        us.receiveMessage(message);
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.getUserId(),user);
    }

}
