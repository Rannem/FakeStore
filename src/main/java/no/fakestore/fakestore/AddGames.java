package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddGames {

    private List<Game> games;

    public AddGames() {
        games = new ArrayList<>();
        games.add(new Game(49.99, 10003, "Minecraft", "Mojang AB", "PC, Console", GameGenre.SANDBOX, "The game involves players creating and destroying various types of blocks in a three dimensional environment. The player takes an avatar that can destroy or create blocks, forming fantastic structures, creations and artwork across the various multiplayer servers in multiple game modes.", "November 19, 2009", "Suitable for 7+"));
    }

    public List<Game> getGames() {
        return games;
    }
}