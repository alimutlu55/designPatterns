package mediatorDesingPattern;

public class Demo {
    public static void main(String[] args) {
        IChatRoom iChatRoom = new ChatRoom();
        User user1 = new ChatUser(iChatRoom, 1, "happy");
        User user2 = new ChatUser(iChatRoom, 2, "gülsen");
        User user3 = new ChatUser(iChatRoom, 3, "gizem");

        iChatRoom.addUser(user1);
        iChatRoom.addUser(user2);
        iChatRoom.addUser(user3);

        user2.sendMessage("Merhaba Gizem",3);
        user3.sendMessage("Selam happy",1);
    }

}
