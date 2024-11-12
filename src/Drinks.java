public enum Drinks {
    FANTA(40),
    SPRITE(50),
    COLA(50),
    LIPTON(120);

    private int value;

    private Drinks(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

