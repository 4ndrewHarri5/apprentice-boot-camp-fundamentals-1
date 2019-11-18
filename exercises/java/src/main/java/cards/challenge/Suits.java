package cards.challenge;

public enum Suits {

    Club("clubs"),
    Spade("spades"),
    Diamond("diamonds"),
    Heart("hearts");

    private String name;

    Suits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Suits convertNumberToSuit(int num) {
        switch (num) {
            case 0:
                return Suits.Club;
            case 1:
                return Suits.Diamond;
            case 2:
                return Suits.Heart;
            case 3:
                return Suits.Spade;
            default:
                throw new ArrayIndexOutOfBoundsException();
        }
    }
}
