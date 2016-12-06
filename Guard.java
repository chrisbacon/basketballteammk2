class Guard implements Scoreable {
    private String name;

    public Guard(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String score() {
        return this.name.toUpperCase() + " SCORES FROM DOWNTOWN!!!";
    }
}