package no.fakestore.fakestore;

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
    private String photo;

    public Movie(String price, int productId, String title, String director, String writer, MovieGenre genre, String duration, String starring, String shortDescription, String releaseDate, String recommendedAgeInfo, String photo) {
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
        this.photo = photo;
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

    public String getPhoto() {
        return photo;
    }
}
