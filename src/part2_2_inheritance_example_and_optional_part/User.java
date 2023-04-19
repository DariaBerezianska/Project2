package part2_2_inheritance_example_and_optional_part;

public class User {
    private String nickname;
    private String phoneNumber;
    private String title;

    public User(String nickname, String phoneNumber, String title) {
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.title = title;
    }

    public String output() {
        return "Nickname: " + nickname + ", Phone Number: " + phoneNumber + ", Title: " + title;
    }
}

