package part2_2_inheritance_example_and_optional_part;

import java.util.ArrayList;

public class Chat {
    private final String chatName;
    private final ArrayList<User> users = new ArrayList<>();
    private final ArrayList<BaseMessage> messages = new ArrayList<>();

    public Chat(String chatName) {
        this.chatName = chatName;
    }

    public void addMessage(BaseMessage message) {
        messages.add(message);
    }

    public ArrayList<FileMessage> getAllFileMessages() {
        ArrayList<FileMessage> fileMessages = new ArrayList<>();
        for (BaseMessage message : messages) {
            if (message instanceof FileMessage) {
                fileMessages.add((FileMessage) message);
            }
        }
        return fileMessages;
    }

    public ArrayList<ImageMessage> getAllImageMessages() {
        ArrayList<ImageMessage> imageMessages = new ArrayList<>();
        for (BaseMessage message : messages) {
            if (message instanceof ImageMessage) {
                imageMessages.add((ImageMessage) message);
            }
        }
        return imageMessages;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public String output() {
        String output = "Chat Name: " + chatName + "\n\n" + "Users: \n";
        for (User user : users) {
            output += user.output() + "\n";
        }
        output += "\nMessages: \n";
        for (BaseMessage message : messages) {
            output += message.output() + "\n";
        }
        return output;
    }
}
