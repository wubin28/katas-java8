package kata.java8;

/**
 * Created by ben on 10/17/14.
 */
public class HeavyApplePickingStrategy extends ApplePickingStrategy {

    @Override
    protected boolean meetCriteria(Apple apple) {
        return apple.getWeight() >= Apple.MINIMUM_GRAMS_OF_HEAVY_APPLE;
    }
}
