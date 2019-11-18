package cards;

public interface DeckService {

    String[] getCards();
    void shuffle();
    CardService deal();

}
