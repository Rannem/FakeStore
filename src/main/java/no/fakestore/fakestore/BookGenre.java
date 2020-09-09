package no.fakestore.fakestore;

public enum BookGenre {

    CHILDREN("Children's"),
    COOKING("Cooking"),
    FANTASY("Fantasy"),
    HEALTH("Health"),
    HISTORY("History"),
    HORROR("Horror"),
    HOW_TO("How-To"),
    MYSTERY("Mystery"),
    SCI_FI("Science Fiction"),
    ROMANCE("Romance"),
    THRILLER("Thriller"),
    TRAVEL("Travel");

    private String description;

    BookGenre(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

}
