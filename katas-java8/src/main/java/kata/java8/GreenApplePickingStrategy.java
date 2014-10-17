package kata.java8;

/**
 * Created by ben on 10/17/14.
 */
public class GreenApplePickingStrategy extends ApplePickingStrategy {

    @Override
    protected boolean meetCriteria(Apple apple) {
        return apple.getColor() == Apple.Color.GREEN;
    }
}
