package part2_2_inheritance_example_and_optional_part;

import java.util.Date;

public class ContactMessage extends BaseMessage {
    private String email;

    public ContactMessage(String data, String author, String email) {
        super(data, author);
        this.email = email;
    }

    @Override
    public String output() {
        return email;
    }
}
