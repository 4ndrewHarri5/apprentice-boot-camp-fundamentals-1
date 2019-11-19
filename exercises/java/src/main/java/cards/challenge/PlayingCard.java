package cards.challenge;

import cards.Card;
import cards.Value;

public class PlayingCard implements Card {

    private final FaceValue value;
    private final Suit suit;

    public PlayingCard(FaceValue value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean snap(Card otherCard) {
        return otherCard != null && this.getValue().getValue().equals(otherCard.getValue().getValue());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
