package mediatorDesingPattern;

public interface IChatRoom {
    void sendMessage(String message,int userId);
    void addUser(User user);
}
