package kata.java8.apple;

/**
 * Created by ben on 9/22/14.
 */
public class Apple {
    private Color color;

    public Apple(Color color) {
        this.color = color;
    }

    public Apple(int weight) {

    }

    public Color getColor() {
        return this.color;
    }

    public int getWeight() {
        return 0;
    }

    public enum Color {RED, GREEN}
}
