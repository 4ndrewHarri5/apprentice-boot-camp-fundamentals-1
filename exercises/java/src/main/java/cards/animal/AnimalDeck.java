package cards.animal;

import cards.Card;
import cards.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalDeck implements Deck {

    private List<Card> cards;

    public AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public List<Card> getCards() {
        return cards;
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }
}
