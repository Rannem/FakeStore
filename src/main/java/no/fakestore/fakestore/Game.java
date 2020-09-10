package no.fakestore.fakestore;

public class Game extends Product {

    private String title;
    private String developer;
    private String platform;
    private GameGenre genre;
    private String shortDescription;
    private String releaseDate;
    private String recommendedAgeInfo;

    public Game(double price, int productId, String title, String developer, String platform, GameGenre genre, String shortDescription, String releaseDate, String recommendedAgeInfo) {
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

    public String getDeveloper() {
        return developer;
    }

    public String getPlatform() {
        return platform;
    }

    public GameGenre getGenre() {
        return genre;
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