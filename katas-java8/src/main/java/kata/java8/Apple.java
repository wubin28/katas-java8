package kata.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public Apple(String varietyName, int weightInGrams) {

    }

    public Color getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    public static List<Apple> pick(List<Apple> apples, Predicate<Apple> applePickingStrategy) {
        List<Apple> pickedApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (applePickingStrategy.test(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }

    public static List<String> listNamesOfApplesHeavierThan90GramsSortedByWeight(List<Apple> apples) {
        return apples.stream()
                .filter(a -> a.getWeight() > 90)
                .sorted(comparing(Apple::getWeight))
                .map(Apple::getVarietyName)
                .collect(toList());
    }

    public enum Color {RED, GREEN}
}
