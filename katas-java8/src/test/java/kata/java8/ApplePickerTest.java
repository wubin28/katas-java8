package kata.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by ben on 10/17/14.
 */
public class ApplePickerTest {
    @Test
    public void the_green_apple_picker_should_pick_green_apples_only() {
        // Arrange
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(Apple.Color.GREEN));
        apples.add(new Apple(Apple.Color.RED));
        apples.add(new Apple(Apple.Color.GREEN));
        ApplePicker applePicker = new ApplePicker();

        // Act
        List<Apple> pickedApples = applePicker.pick(apples, Apple::isGreenApple);

        // Assert
        assertThat(pickedApples.size()).isEqualTo(2);
        for (Apple apple : pickedApples) {
            assertThat(apple.getColor()).isEqualTo(Apple.Color.GREEN);
        }
    }

    @Test
    public void the_heavy_apple_picker_should_pick_heavy_apples_only() {
        // Arrange
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(Apple.MINIMUM_GRAMS_OF_HEAVY_APPLE + 10));
        apples.add(new Apple(Apple.MINIMUM_GRAMS_OF_HEAVY_APPLE - 10));
        apples.add(new Apple(Apple.MINIMUM_GRAMS_OF_HEAVY_APPLE - 10));

        // Act
        ApplePicker applePicker = new ApplePicker();
        List<Apple> pickedApples = applePicker.pick(apples, Apple::isHeavyApple);

        // Assert
        assertThat(pickedApples.size()).isEqualTo(1);
        for (Apple apple : pickedApples) {
            assertThat(apple.getWeight()).isGreaterThan(Apple.MINIMUM_GRAMS_OF_HEAVY_APPLE);
        }
    }
}
