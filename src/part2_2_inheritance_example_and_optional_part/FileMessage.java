package part2_2_inheritance_example_and_optional_part;

import java.util.Date;

public class FileMessage extends TextMessage {
    private String fileLink;

    public FileMessage(String date, String author, String message, String fileLink) {
        super(date, author, message);
        this.fileLink = fileLink;
    }

    @Override
    public String output() {
        return super.output() + "\n" + fileLink;
    }
}
