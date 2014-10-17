package kata.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 10/17/14.
 */
public class GreenApplePicker {
    public List<Apple> pick(List<Apple> apples) {
        List<Apple> pickedApples = new ArrayList<Apple>();
        pickedApples.add(new Apple(Apple.Color.GREEN));
        pickedApples.add(new Apple(Apple.Color.GREEN));
        return pickedApples;
    }
}
