package kata.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 10/17/14.
 */
public class HeavyApplePicker {
    public List<Apple> pick(List<Apple> apples) {
        List<Apple> pickedApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (meetCriteria(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }

    private boolean meetCriteria(Apple apple) {
        return apple.getWeight() >= Apple.MINIMUM_GRAMS_OF_HEAVY_APPLE;
    }
}
