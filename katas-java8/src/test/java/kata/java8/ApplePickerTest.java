package kata.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

        // Act
        List<Apple> pickedApples = Apple.pick(apples, apple -> apple.getColor() == Apple.Color.GREEN);

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
        List<Apple> pickedApples = Apple.pick(apples, apple -> apple.getWeight() >= Apple.MINIMUM_GRAMS_OF_HEAVY_APPLE);

        // Assert
        assertThat(pickedApples.size()).isEqualTo(1);
        for (Apple apple : pickedApples) {
            assertThat(apple.getWeight()).isGreaterThan(Apple.MINIMUM_GRAMS_OF_HEAVY_APPLE);
        }
    }

    @Test
    public void list_the_names_of_apples_heavier_than_90_grams_being_sorted_by_weight() {
        // Arrange
        List<Apple> apples = Arrays.asList(
                new Apple("WolfRiver", 300),
                new Apple("CentennialCrab", 80),
                new Apple("Discovery", 260),
                new Apple("Dabinett", 85),
                new Apple("King", 255),
                new Apple("NewtonPippin", 90)
        );
        List<String> expectedList = new ArrayList<>(Arrays.asList(
                "WolfRiver", "Discovery", "King"));

        // Act
        List<String> filteredAndSortedList = Apple.listNamesOfApplesHeavierThan90GramsSortedByWeight(apples);

        // Assert
        assertThat(filteredAndSortedList).isEqualsTo(expectedList);
    }
}
