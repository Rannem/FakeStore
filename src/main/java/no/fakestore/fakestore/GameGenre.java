package no.fakestore.fakestore;

public enum GameGenre {

    ACTION("Action"),
    ADVENTURE("Adventure"),
    RPG("Role-playing"),
    SANDBOX("Sandbox"),
    SIM("Simulation"),
    STRATEGY("Strategy"),
    SPORTS("Sports"),
    PUZZLE("Puzzle"),
    SCI_FI("Science Fiction");

    private String description;

    GameGenre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
