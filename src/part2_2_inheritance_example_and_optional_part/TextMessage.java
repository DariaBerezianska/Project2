package part2_2_inheritance_example_and_optional_part;

import java.util.Date;

public class TextMessage extends BaseMessage {
    protected String message;

    public TextMessage(String date, String author, String message) {
        super(date, author);
        this.message = message;
    }

    @Override
    public String output() {
        return message;
    }

}
