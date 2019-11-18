package cards.challenge;

import cards.CardService;
import cards.DeckService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck implements DeckService {

    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public Deck() {}


    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getAllCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }



    public Deck generateNewDeck() {

        // there are 4 suits, each of them holding all of the cards for that suit
        List<Card> allCards = new ArrayList<>();
        for (int i = 0; i < CardConfig.NUMBER_OF_SUITS; i++) {
            Suits currentSuit = Suits.convertNumberToSuit(i);
            Suit suit = new Suit(currentSuit);
            List<Card> cardsForSuit = generateCardsForSuit(suit);
            allCards.addAll(cardsForSuit);
        }

        return new Deck(allCards);
    }

    private List<Card> generateCardsForSuit(Suit suit) {

        List<Card> cards = new ArrayList<>();

        for (int i = 1; i < CardConfig.NUMBER_OF_CARDS_IN_SUIT; i++) {
            Value cardValue = new FaceValue(i);
            Card newestCard = new Card(cardValue, suit);
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
            Card card = cards.get(i);
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
