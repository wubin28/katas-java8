package kata.java8;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by ben on 10/17/14.
 */
public class ApplePickerTest {
    @Test
    public void the_green_apple_picker_should_pick_green_apples_only() {
        // Arrange
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple(Apple.Color.GREEN));
        apples.add(new Apple(Apple.Color.RED));
        apples.add(new Apple(Apple.Color.GREEN));

        // Act
        List<Apple> pickedApples = greenApplePicker(apples);

        // Assert
        assertThat(pickedApples.size()).isEqualTo(2);
        for (Apple apple : pickedApples) {
            assertThat(apple.getColor()).isEqualTo(Apple.Color.GREEN);
        }
    }
}
