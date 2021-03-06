package ladder.domain.player;

import java.util.Objects;

public class Player {

    private static final int MAX_NAME_LENGTH = 5;

    private String name;

    private Player(String name) {
        this.name = name;
    }

    public static Player of(String name) {
        validate(name);
        return new Player(name);
    }

    private static void validate(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("이름은 null이거나 빈 공백일 수 없습니다.");
        }

        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format("이름의 최대 글자수는 %d입니다. : %s", MAX_NAME_LENGTH, name));
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Player that = (Player) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
