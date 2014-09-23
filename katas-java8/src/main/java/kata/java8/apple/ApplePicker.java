package kata.java8.apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 9/22/14.
 */
public class ApplePicker {

    public ApplePicker() {

    }

    public List<Apple> pick(List<Apple> apples, ApplePickingStrategy applePickingStrategy) {
        List<Apple> pickedApples = new ArrayList<Apple>();
        for (Apple apple : apples) {
            if (applePickingStrategy.meetCriteria(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }
}
