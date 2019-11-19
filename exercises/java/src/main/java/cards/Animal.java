package cards;

enum Animal implements Value {
    AARDVARK,
    BABOON,
    CAMEL,
    DEER,
    ELEPHANT,
    FROG,
    GORILLA,
    HARE,
    IMPALA,
    JAGUAR,
    KANGAROO,
    LION,
    MOOSE,
    NEWT,
    OCTOPUS,
    PENGUIN,
    QUETZAL,
    RABBIT,
    SALMON,
    TORTOISE,
    UAKARIS,
    VAQUITA,
    WHALE,
    X_RAY_TETRA,
    YAK,
    ZEBRA;

    @Override
    public String getValue() {
        return this.toString();
    }

}