package cards;

public interface CardService {
    boolean snap(CardService otherCard);
    ValueService getValue();
}
