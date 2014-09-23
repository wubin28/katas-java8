package kata.java8.apple;

/**
 * Created by ben on 9/22/14.
 */
public class Apple {
    public static final int HEAVY_APPLE_WEIGHS_AT_LEAST = 150;
    private int weight;
    private Color color;

    public Apple(Color color) {
        this(color, HEAVY_APPLE_WEIGHS_AT_LEAST);
    }

    public Apple(int weight) {
        this(Color.GREEN, weight);
    }

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return apple.getColor() == Color.GREEN;
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > Apple.HEAVY_APPLE_WEIGHS_AT_LEAST;
    }

    public enum Color {RED, GREEN}
}
