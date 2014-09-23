package kata.java8.apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public static <T> List<T> pick(List<T> apples, Predicate<T> p) {
        List<T> pickedApples = new ArrayList<T>();
        for (T apple : apples) {
            if (p.test(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }

    public enum Color {RED, GREEN}
}
