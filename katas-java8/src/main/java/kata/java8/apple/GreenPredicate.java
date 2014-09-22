package kata.java8.apple;

/**
 * Created by ben on 9/22/14.
 */
public class GreenPredicate implements Predicate {
    @Override
    public boolean meetCriteria(Apple apple) {
        return apple.getColor() == Apple.Color.GREEN;
    }
}
