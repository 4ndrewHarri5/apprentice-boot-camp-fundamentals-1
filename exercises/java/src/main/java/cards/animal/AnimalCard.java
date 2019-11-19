package cards.animal;

import cards.Card;

public class AnimalCard extends Card {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean snap(Card otherCard){
        return otherCard instanceof AnimalCard && this.animal.toString().equals(otherCard.getValue());
    }

    @Override
    public String getValue() {
        return this.animal.toString();
    }

    @Override
    public String toString() {
        return animal.toString();
    }

}
