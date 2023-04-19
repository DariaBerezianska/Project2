package part2_2_inheritance_example_and_optional_part;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TextMessage
        TextMessage message1 = new TextMessage("text message", "user1", "Hello, can you call me later?");
        System.out.println(message1.output());
        //ImageMessage
        ImageMessage message2 = new ImageMessage("image message", "user2", "Do you like this image?",
                "https://pixabay.com/photos/code-html-digital-coding-web-1076536/");
        System.out.println(message2.output());
        //VoiceMessage
        VoiceMessage message3 = new VoiceMessage("voice message", "user3", "https://youtu.be/RRubcjpTkks");
        System.out.println(message3.output());
        //FileMessage
        FileMessage message4 = new FileMessage("file message", "user4", "Can you check if this file works for you?",
                "https://www.icloud.com/iclouddrive/0e6wbAQznIMp1PUNbO64e60Pg#burger-cse205-note-arrays-01");
        System.out.println(message4.output());
        //LocationMessage
        LocationMessage message5 = new LocationMessage("location message", "user5", "https://auk.edu.ua/ua/contact/");
        System.out.println(message5.output());
        //ContactMessage
        ContactMessage message6 = new ContactMessage("contact message", "user6", "info@auk.edu.ua");
        System.out.println(message6.output());
        System.out.println();
        // Create chat
        Chat chat1 = new Chat("UniChat");
        // Creat users
        User user1 = new User("hhhoib", "0852871625", "teacher");
        User user2 = new User("wingate", "0972251887", "student");
        // Add users to the chat
        chat1.addUser(user1);
        chat1.addUser(user2);
        // Add messages to the chat
        chat1.addMessage(message1);
        chat1.addMessage(message2);
        chat1.addMessage(message3);
        chat1.addMessage(message4);
        chat1.addMessage(message5);
        chat1.addMessage(message6);
        System.out.println(chat1.output());
        //Filter messages by type
        ArrayList<FileMessage> fileMessages = chat1.getAllFileMessages();
        ArrayList<ImageMessage> imageMessages = chat1.getAllImageMessages();

        // Print file messages
        System.out.println("\nFile Messages:");
        for (FileMessage message : fileMessages) {
            System.out.println(message.output());
        }

        // Print image messages
        System.out.println("\nImage Messages:");
        for (ImageMessage message : imageMessages) {
            System.out.println(message.output());
        }
    }
}

