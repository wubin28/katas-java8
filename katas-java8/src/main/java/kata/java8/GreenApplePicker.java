package kata.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 10/17/14.
 */
public class GreenApplePicker {
    public List<Apple> pick(List<Apple> apples) {
        List<Apple> pickedApples = new ArrayList<Apple>();
        for (Apple apple : apples) {
            if (apple.getColor() == Apple.Color.GREEN) {
                pickedApples.add(apple);
            }
        }
        return pickedApples;
    }
}
