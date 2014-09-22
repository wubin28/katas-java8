package kata.java8.apple;

/**
 * Created by ben on 9/22/14.
 */
public class Apple {
    private Color color;

    public Apple(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public enum Color {RED, GREEN}
}
