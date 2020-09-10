package no.fakestore.fakestore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Movie extends Product {

    private String title;
    private String director;
    private String writer;
    private MovieGenre genre;
    private String duration;
    private String starring;
    private String shortDescription;
    private String releaseDate;
    private String recommendedAgeInfo;

    public Movie(double price, int productId, String title, String director, String writer, MovieGenre genre, String duration, String starring, String shortDescription, LocalDate releaseDate, String recommendedAgeInfo) {
        super(price, productId, "Movie");
        this.title = title;
        this.director = director;
        this.writer = writer;
        this.genre = genre;
        this.duration = duration;
        this.starring = starring;
        this.shortDescription = shortDescription;
        this.releaseDate = releaseDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public String getDuration() {
        return duration;
    }

    public String getStarring() {
        return starring;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }
}
