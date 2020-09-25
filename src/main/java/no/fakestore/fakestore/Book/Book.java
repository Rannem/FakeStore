package no.fakestore.fakestore.Book;

import no.fakestore.fakestore.Product;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book extends Product {

    private String title;
    private String author;
    private String publisher;
    private BookGenre genre;
    private String shortDescription;
    private String releaseDate;
    private String language;
    private String recommendedAgeInfo;
    private String photo;

    public Book() {
        super();
    }

    public Book(String price, String title, String author, String publisher, BookGenre genre, String shortDescription, String releaseDate, String language, String recommendedAgeInfo, String photo) {
        super(price);
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.shortDescription = shortDescription;
        this.releaseDate = releaseDate;
        this.language = language;
        this.recommendedAgeInfo = recommendedAgeInfo;
        this.photo = photo;
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

    public String getPhoto() {
        return photo;
    }


}
