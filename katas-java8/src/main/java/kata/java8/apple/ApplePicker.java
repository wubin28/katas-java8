package kata.java8.apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 9/22/14.
 */
public class ApplePicker {
    private ApplePickingStrategy applePickingStrategy;

    public ApplePicker(ApplePickingStrategy applePickingStrategy) {
        this.applePickingStrategy = applePickingStrategy;
    }

    public List<Apple> pick(List<Apple> apples) {
        List<Apple> pickedApples = new ArrayList<Apple>();
        for (Apple apple : apples) {
            if (this.applePickingStrategy.meetCriteria(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }
}
