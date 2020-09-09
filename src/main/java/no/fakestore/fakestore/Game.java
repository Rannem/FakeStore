package no.fakestore.fakestore;

import java.time.LocalDate;

public class Game extends Product {

    private String title;
    private String developer;
    private String platform;
    private GameGenre genre;
    private String shortDescription;
    private LocalDate releaseDate;
    private String recommendedAgeInfo;

    public Game(double price, int productId, String title, String developer, String platform, GameGenre genre, String shortDescription, LocalDate releaseDate, String recommendedAgeInfo) {
        super(price, productId, "Game");
        this.title = title;
        this.developer = developer;
        this.platform = platform;
        this.genre = genre;
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

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public void setGenre(GameGenre genre) {
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

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }
}
