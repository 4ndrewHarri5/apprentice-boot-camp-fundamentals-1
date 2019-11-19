package cards;

public abstract class Card {
    public abstract boolean snap(Card otherCard);
    public abstract String getValue();
}
