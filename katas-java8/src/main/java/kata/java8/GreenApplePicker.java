package kata.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ben on 10/17/14.
 */
public class GreenApplePicker extends ApplePicker {

    @Override
    protected boolean meetCriteria(Apple apple) {
        return apple.getColor() == Apple.Color.GREEN;
    }
}
