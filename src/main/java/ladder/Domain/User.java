package ladder.Domain;


import java.util.Collections;
import java.util.List;

public class User {

    private final String name;
    private Position position;

    public User(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public static User of(String name, Position position) {
        return new User(name, position);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        User compareUser = (User) obj;
        return name.equals(compareUser.name)
                && position.equals(compareUser.position);
    }
}