package kata.java8;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by ben on 10/17/14.
 */
public class ApplePickerTest {
    @Test
    public void the_green_apple_picker_should_pick_green_apples_only() {
        // Assert
        for (Apple apple : apples) {
            assertThat(apple.getColor()).isEqualTo(Apple.Color.GREEN);
        }
    }
}
