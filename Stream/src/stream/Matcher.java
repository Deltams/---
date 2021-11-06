package stream;

import java.util.Objects;

public class Matcher{

    public static boolean match(String str, String character) {
        Objects.requireNonNull(character);
        if (character.length() != 1) {
            throw new IllegalArgumentException("Template must have one character");
        }

        long delay = 100;

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return str.contains(character);
    }
}
