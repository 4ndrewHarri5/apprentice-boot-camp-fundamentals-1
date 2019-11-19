package cards.playing;

public class Suit {

    private final Suits suit;

    public Suit(Suits suit) {
        this.suit = suit;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return suit.getName();
    }
}
