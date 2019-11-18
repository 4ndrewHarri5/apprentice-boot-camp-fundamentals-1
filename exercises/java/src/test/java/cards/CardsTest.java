package cards;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardsTest {

    @Test
    public void getDeckInOrder_return52CardsCorrectlyFormatted() {
        Cards cards = new Cards();
        assertThat(cards.getCards()).containsExactly(
                ""
        );
    }
}