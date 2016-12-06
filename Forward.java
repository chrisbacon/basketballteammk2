class Forward implements Scoreable {
    private String name;

    public Forward(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String score() {
        return this.name.toUpperCase() + "!!! WITH NO REGARD FOR HUMAN LIFE!!!";
    }
}