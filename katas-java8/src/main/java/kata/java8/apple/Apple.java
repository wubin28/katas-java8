package kata.java8.apple;

import java.util.ArrayList;
import java.util.List;

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
        return Color.GREEN == apple.getColor();
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > Apple.HEAVY_APPLE_WEIGHS_AT_LEAST;
    }

    public enum Color {RED, GREEN}

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> p) {
        List<Apple> pickedApples = new ArrayList<Apple>();
        for (Apple apple : apples) {
            if (p.meetCriteria(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }
}
