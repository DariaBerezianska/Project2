package part2_2_inheritance_example_and_optional_part;

import java.util.Date;

public class ImageMessage extends TextMessage {
    private String imageLink;

    public ImageMessage(String data, String author, String message, String imageLink) {
        super(data, author, message);
        this.imageLink = imageLink;
    }

    @Override
    public String output() {
        return super.output() + "\n" + imageLink;
    }
}
