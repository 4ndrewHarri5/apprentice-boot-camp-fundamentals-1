package cards.playing;

import cards.Card;

public class PlayingCard extends Card {

    private final FaceValue value;
    private final Suit suit;

    public PlayingCard(FaceValue value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getValue() {
        return value.toString();
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean snap(Card otherCard) {
        return otherCard instanceof PlayingCard && this.getValue().equals(otherCard.getValue());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
