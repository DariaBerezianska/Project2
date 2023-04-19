package part2_2_inheritance_example_and_optional_part;

import java.util.Date;

public class VoiceMessage extends BaseMessage {
    private String voiceLink;

    public VoiceMessage(String data, String author, String voiceLink) {
        super(data, author);
        this.voiceLink = voiceLink;
    }

    @Override
    public String output() {
        return voiceLink;
    }
}
