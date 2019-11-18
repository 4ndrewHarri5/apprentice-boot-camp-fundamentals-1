package cards.challenge;

import cards.CardService;
import cards.ValueService;

public class Card implements CardService {

    private final Value value;
    private final Suit suit;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public ValueService getValue() {
        return value.getFaceValue().getValue();
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean snap(CardService otherCard) {
        return false;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value.toString() +
                ", suit=" + suit.toString() +
                '}';
    }
}
