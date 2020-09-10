package no.fakestore.fakestore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Book extends Product {

    private String title;
    private String author;
    private String publisher;
    private BookGenre genre;
    private String shortDescription;
    private String releaseDate;
    private String language;
    private String recommendedAgeInfo;

    public Book(double price, int productId, String title, String author, String publisher, BookGenre genre, String shortDescription, String releaseDate, String language, String recommendedAgeInfo) {
        super(price, productId, "Book");
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.shortDescription = shortDescription;
        this.releaseDate = releaseDate;
        this.language = language;
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getLanguage() {
        return language;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }
}
