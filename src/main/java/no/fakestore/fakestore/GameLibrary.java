package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameLibrary {

    private List<Game> games;

    public GameLibrary() {
        games = new ArrayList<>();
        games.add(new Game("49.99", 10103, "Minecraft", "Mojang AB", "PC, Console", GameGenre.SANDBOX, "Amazing sandbox game with zombies.", "November 19, 2009", "Suitable for 7+", "/Assets/minecraft.jpg"));
        games.add(new Game("49.99", 10104, "Watch Dogs 2", "Ubisoft", "PS4, Xbox", GameGenre.RPG, "is a 2016 action-adventure game.", "November 15, 2016", "Suitable for 16+", "/Assets/WatchDogs.jpg"));
        games.add(new Game("29.99", 10105, "Inertial Drift", "PQube", "PS4, Xbox, Switch", GameGenre.SPORTS, "It's been a long road but we're finally here.", "Septemper 11, 2020", "Suitable for 7+", "/Assets/inertial.jpg"));
        games.add(new Game("49.99", 10106, "Past Cure", "Phantom 8 Studio", "PC", GameGenre.ACTION, "A former elite soldier, who has undergone military experiments and tries to uncover his past.", "February 23, 2018", "Suitable for 18+", "/Assets/Pastcure.jpg"));
    }

    public List<Game> getGames() {
        return games;
    }

    public List<Game> getPage(int page, int pageSize) {
        int from = Math.max(0, page * pageSize);
        int to = Math.min(games.size(), (page + 1) * pageSize);

        return games.subList(from, to);
    }

    public int numberOfPages(int pageSize) {
        return (int) Math.ceil((double) games.size() / pageSize);
    }

    public Game getGame(int id) {
        for (Game game : games) {
            if (game.getProductId() == id) {
                return game;
            }
        }
        return null;
    }
}