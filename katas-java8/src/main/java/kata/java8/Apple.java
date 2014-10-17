package kata.java8;

/**
 * Created by ben on 10/17/14.
 */
public class Apple {
    public static final int MINIMUM_GRAMS_OF_HEAVY_APPLE = 150;
    private Color color;
    private int weight;

    public Apple(Color color) {
        this.color = color;
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    public enum Color {RED, GREEN}
}
