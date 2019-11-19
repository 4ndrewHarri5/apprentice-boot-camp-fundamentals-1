package cards.playing;

import cards.Card;
import cards.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingDeck implements Deck {

    private List<PlayingCard> cards;

    public PlayingDeck(List<PlayingCard> cards) {
        this.cards = new ArrayList<>();
        this.cards.addAll(cards);
    }

    public PlayingDeck() {}

    public static PlayingDeck generateNewDeck() {
        // there are 4 suits, each of them holding all of the cards for that suit
        List<PlayingCard> allCards = new ArrayList<>();
        for (int i = 0; i < CardConfig.NUMBER_OF_SUITS; i++) {
            Suits currentSuit = Suits.convertNumberToSuit(i);
            Suit suit = new Suit(currentSuit);
            List<PlayingCard> cardsForSuit = generateCardsForSuit(suit);
            allCards.addAll(cardsForSuit);
        }

        return new PlayingDeck(allCards);
    }

    private static List<PlayingCard> generateCardsForSuit(Suit suit) {

        List<PlayingCard> cards = new ArrayList<>();

        for (int i = 1; i < CardConfig.NUMBER_OF_CARDS_IN_SUIT; i++) {
            FaceValue cardValue = new FaceValue(i);
            PlayingCard newestCard = new PlayingCard(cardValue, suit);
            cards.add(newestCard);
        }

        return cards;
    }

    public void setCards(List<PlayingCard> cards) {
        cards = new ArrayList<>();
        this.cards.addAll(cards);
    }

    public List<PlayingCard> getAllCards() {
        return cards;
    }

    public void addCard(PlayingCard card) {
        this.cards.add(card);
    }

    public void outputCards() {
        cards.forEach(card -> {
            System.out.println(card.getValue().getValue() + " of " + card.getSuit().getSuit().getName());
        });
    }

    @Override
    public List<Card> getCards() {
        return new ArrayList<>(cards);
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
