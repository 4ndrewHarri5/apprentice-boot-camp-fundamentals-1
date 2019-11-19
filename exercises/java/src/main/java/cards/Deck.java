package cards;

import java.util.List;

public abstract class Deck {

    public abstract List<Card> getCards();
    public abstract void shuffle();
    public abstract Card deal();

}
