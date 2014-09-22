package kata.java8.apple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

/**
 * Created by ben on 9/22/14.
 */
public class AppleTest {
    @Test
    public void the_green_apple_picker_should_pick_green_apples_only() {
        // Arrange
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple("Green"));
        apples.add(new Apple("Red"));
        apples.add(new Apple("Green"));
        GreenApplePicker greenApplePicker = new GreenApplePicker();

        // Act
        List<Apple> pickedApples = greenApplePicker.pick(apples);

        // Assert
        for (Apple apple : pickedApples) {
            assertThat(apple.getColor()).isEqualTo(Apple.GREEN);
        }
    }
}
