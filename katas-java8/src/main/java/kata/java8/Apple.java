package kata.java8;

/**
 * Created by ben on 10/17/14.
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
