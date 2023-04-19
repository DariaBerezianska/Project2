package part2_2_inheritance_example_and_optional_part;

import java.util.Date;

public class LocationMessage extends BaseMessage {
    private String locationLink;

    public LocationMessage(String data, String author, String locationLink) {
        super(data, author);
        this.locationLink = locationLink;
    }

    @Override
    public String output() {
        return locationLink;
    }
}
