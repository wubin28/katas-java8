package kata.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 10/17/14.
 */
public class ApplePicker {
    public List<Apple> pick(List<Apple> apples, ApplePickingStrategy applePickingStrategy) {
        List<Apple> pickedApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (applePickingStrategy.meetCriteria(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }
}
