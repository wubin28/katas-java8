package kata.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 10/17/14.
 */
public abstract class ApplePicker {
    public List<Apple> pick(List<Apple> apples) {
        List<Apple> pickedApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (meetCriteria(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }

    protected abstract boolean meetCriteria(Apple apple);
}
