package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddMovies {

    private List<Movie> movies;

    public AddMovies() {
        movies = new ArrayList<>();
        movies.add(new Movie(20.00, 10002, "Tenet ", "Christopher Nolan", "Christopher Nolan", MovieGenre.ACTION, "2h 30min", "John David Washington, Robert Pattinson, Elizabeth Debicki", "Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.", "\n" +
                "August 28, 2020", "12 years and above"));
    }

    public List<Movie> getMovies() {
        return movies;
    }
}