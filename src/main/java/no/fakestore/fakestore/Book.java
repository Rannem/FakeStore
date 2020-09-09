package no.fakestore.fakestore;

import java.time.LocalDate;

public class Book extends Product {

    private String title;
    private String author;
    private String publisher;
    private BookGenre genre;
    private String shortDescription;
    private LocalDate releaseDate;
    private String language;
    private String recommendedAgeInfo;

    public Book(double price, int productId, String title, String author, String publisher, BookGenre genre, String shortDescription, LocalDate releaseDate, String language, String recommendedAgeInfo) {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }
}
