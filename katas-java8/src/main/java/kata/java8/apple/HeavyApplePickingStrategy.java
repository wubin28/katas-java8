package kata.java8.apple;

/**
 * Created by ben on 9/22/14.
 */
public class HeavyApplePickingStrategy implements ApplePickingStrategy {
    @Override
    public boolean meetCriteria(Apple apple) {
        return apple.getWeight() > Apple.HEAVY_APPLE_WEIGHS_AT_LEAST;
    }
}
