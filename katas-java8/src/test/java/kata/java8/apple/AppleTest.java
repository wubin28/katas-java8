package kata.java8.apple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by ben on 9/22/14.
 */
public class AppleTest {
    @Test
    public void the_green_apple_picker_should_pick_green_apples_only() {
        // Arrange
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple(Apple.Color.GREEN));
        apples.add(new Apple(Apple.Color.RED));
        apples.add(new Apple(Apple.Color.GREEN));

        // Act
        List<Apple> pickedApples = Apple.filterApples(apples, Apple::isGreenApple);

        int numOfApplesPicked = 0;
        // Assert
        for (Apple apple : pickedApples) {
            assertThat(apple.getColor()).isEqualTo(Apple.Color.GREEN);
            numOfApplesPicked++;
        }
        assertThat(numOfApplesPicked).isEqualTo(2);
    }

    @Test
    public void the_heavy_apple_picker_should_pick_heavy_apples_only() {
        // Arrange
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple(160));
        apples.add(new Apple(170));
        apples.add(new Apple(140));

        // Act
        List<Apple> pickedApples = Apple.filterApples(apples, Apple::isHeavyApple);

        int numOfApplesPicked = 0;
        // Assert
        for (Apple apple : pickedApples) {
            assertThat(apple.getWeight()).isGreaterThan(150);
            numOfApplesPicked++;
        }
        assertThat(numOfApplesPicked).isEqualTo(2);
    }
}
