package mediatorDesingPattern;

public abstract class User {
    IChatRoom mediator;
    int userId;
    String userName;

    public User(IChatRoom chatRoom, int userId, String userName) {
        this.mediator = chatRoom;
        this.userId = userId;
        this.userName = userName;
    }
    abstract void sendMessage(String message,int userId);
    abstract void receiveMessage(String message);

    public IChatRoom getChatRoom() {
        return mediator;
    }

    public void setChatRoom(IChatRoom chatRoom) {
        this.mediator = chatRoom;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
