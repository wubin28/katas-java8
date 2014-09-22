package kata.java8.apple;

import org.junit.Test;

/**
 * Created by ben on 9/22/14.
 */
public class AppleTest {
    @Test
    public void the_green_apple_picker_should_pick_green_apples_only() {
        // Assert
        for (Apple apple : apples) {
            assertThat(apple.getColor()).isEqualTo(Apple.GREEN);
        }
    }
}
