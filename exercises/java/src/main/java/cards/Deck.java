package cards;

import java.util.List;

public interface Deck {

    List<Card> getCards();
    void shuffle();
    Card deal();

}
