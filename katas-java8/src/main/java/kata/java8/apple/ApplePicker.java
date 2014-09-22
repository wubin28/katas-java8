package kata.java8.apple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 9/22/14.
 */
public class ApplePicker {
    private Predicate predicate;

    public ApplePicker(Predicate predicate) {
        this.predicate = predicate;
    }

    public List<Apple> pick(List<Apple> apples) {
        List<Apple> pickedApples = new ArrayList<Apple>();
        for (Apple apple : apples) {
            if (this.predicate.meetCriteria(apple)) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }
}
