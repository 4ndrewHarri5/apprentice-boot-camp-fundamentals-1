package cards.challenge;

import cards.CardService;
import cards.ValueService;

public class PlayingCard implements CardService {

    private final FaceValue value;
    private final Suit suit;

    public PlayingCard(FaceValue value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public ValueService getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean snap(CardService otherCard) {
        return otherCard != null && this.getValue().getValue().equals(otherCard.getValue().getValue());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
