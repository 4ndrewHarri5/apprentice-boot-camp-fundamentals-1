package cards.challenge;

import cards.CardService;
import cards.DeckService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements DeckService {

    private List<PlayingCard> cards;

    public Deck(List<PlayingCard> cards) {
        this.cards = cards;
    }

    public Deck() {}


    public void setCards(List<PlayingCard> cards) {
        this.cards = cards;
    }

    public List<PlayingCard> getAllCards() {
        return cards;
    }

    public void addCard(PlayingCard card) {
        this.cards.add(card);
    }


    public Deck generateNewDeck() {

        // there are 4 suits, each of them holding all of the cards for that suit
        List<PlayingCard> allCards = new ArrayList<>();
        for (int i = 0; i < CardConfig.NUMBER_OF_SUITS; i++) {
            Suits currentSuit = Suits.convertNumberToSuit(i);
            Suit suit = new Suit(currentSuit);
            List<PlayingCard> cardsForSuit = generateCardsForSuit(suit);
            allCards.addAll(cardsForSuit);
        }

        return new Deck(allCards);
    }

    private List<PlayingCard> generateCardsForSuit(Suit suit) {

        List<PlayingCard> cards = new ArrayList<>();

        for (int i = 1; i < CardConfig.NUMBER_OF_CARDS_IN_SUIT; i++) {
            FaceValue cardValue = new FaceValue(i);
            PlayingCard newestCard = new PlayingCard(cardValue, suit);
            cards.add(newestCard);
        }

        return cards;
    }

    public void outputCards() {
        cards.forEach(card -> {
            System.out.println(card.getValue().getValue() + " of " + card.getSuit().getSuit().getName());
        });
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            PlayingCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public CardService deal() {
        return cards.remove(0);
    }

}
