package no.fakestore.fakestore.Movie;

public enum MovieGenre {

    ACTION("Action"),
    ANIMATION("Animation"),
    COMEDY("Comedy"),
    DOCUMENTARY("Documentary"),
    DRAMA("Drama"),
    FANTASY("Fantasy"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    SCI_FI("Science Fiction"),
    THRILLER("Thriller"),
    WESTERN("Western");

    private String description;

    MovieGenre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
