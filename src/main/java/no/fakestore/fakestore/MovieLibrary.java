package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieLibrary {

    private List<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
        movies.add(new Movie("20.00", 10012, "Tenet ", "Christopher Nolan", "Christopher Nolan", MovieGenre.ACTION, "2h 30min", "John David Washington, Robert Pattinson, Elizabeth Debicki", "Amazing movie, starring amazing actors.", "\n" +
                "August 28, 2020", "12 years and above", "/Assets/tenet.jpg"));
    }

    public List<Movie> getMovies() {
        return movies;
    }
}