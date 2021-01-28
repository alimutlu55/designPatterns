package mediatorDesingPattern;

public class ChatUser extends User {

    public ChatUser(IChatRoom chatRoom, int userId, String userName) {
        super(chatRoom, userId, userName);
    }

    @Override
    void sendMessage(String message, int userId) {
        System.out.println(this.getUserName()+ " : "+ "'" + message + "'" + "message is sending.");
        mediator.sendMessage(message,userId);
    }

    @Override
    void receiveMessage(String message) {
        System.out.println(this.getUserName() + " : "+ "'" + message + "'" + "message received.");
    }
}
