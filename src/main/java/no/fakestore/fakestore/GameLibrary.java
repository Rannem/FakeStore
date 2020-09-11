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
    }

    public List<Game> getGames() {
        return games;
    }
}