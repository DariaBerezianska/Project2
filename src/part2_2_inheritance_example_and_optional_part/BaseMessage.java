package part2_2_inheritance_example_and_optional_part;

import javax.xml.crypto.Data;
import java.util.Date;

public abstract class BaseMessage {
    private String data;
    protected String author;

    public BaseMessage(String data, String author) {
        this.data = data;
        this.author = author;
    }

    public abstract String output();
}

