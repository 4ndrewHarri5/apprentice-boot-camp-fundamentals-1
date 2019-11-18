package cards;

public class AnimalCard implements CardService {

    private final Animal animal;

    AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean snap(CardService otherCard){
        return otherCard != null && this.animal.equals(otherCard.getValue());
    }

    @Override
    public ValueService getValue() {
        return this.animal;
    }

    @Override
    public String toString() {
        return animal.toString();
    }

}
