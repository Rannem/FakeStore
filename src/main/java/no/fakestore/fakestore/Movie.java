package no.fakestore.fakestore;

import java.time.LocalDate;

public class Movie extends Product {

    private String title;
    private String director;
    private String writer;
    private MovieGenre genre;
    private String duration;
    private String starring;
    private String shortDescription;
    private LocalDate releaseDate;
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
        this.releaseDate = releaseDate;
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
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

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }
}
