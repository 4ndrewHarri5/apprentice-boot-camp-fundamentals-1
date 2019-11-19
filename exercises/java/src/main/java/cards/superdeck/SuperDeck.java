package cards.superdeck;

import cards.Card;
import cards.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperDeck implements Deck {

    private List<Card> cards;

    public SuperDeck(List<Deck> decks) {
        cards = new ArrayList<>();
        decks.forEach(deck -> cards.addAll(deck.getCards()));
    }

    @Override
    public List<Card> getCards() {
        return cards;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }
}
