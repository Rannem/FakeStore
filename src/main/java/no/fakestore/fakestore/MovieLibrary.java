package no.fakestore.fakestore;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieLibrary {

    private List<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
        movies.add(new Movie("39.90", 10012, "Tenet", "Christopher Nolan", "Christopher Nolan", MovieGenre.ACTION, "2h 30min", "John David Washington, Robert Pattinson, Elizabeth Debicki", "Amazing movie, starring amazing actors.", "\n" +
                "August 28, 2020", "12 years and above", "/Assets/tenet.jpg"));
        movies.add(new Movie("69.69", 10013, "\n" +
                "No Time to Die", "Cary Joji Fukunaga", "Neal Purvis, Robert Wade", MovieGenre.THRILLER, "2h 43min", " Ana de Armas, Daniel Craig, Léa Seydoux", "Amazing action movie, with tons of action.", "\n" +
                "November 12, 2020", "16 years and above", "/Assets/bond.jpg"));
        movies.add(new Movie("49.90", 10014, "Enola Holmes", "Harry Bradbeer", "Nancy Springer, Jack Thorne", MovieGenre.DRAMA, "2h 3min", "Millie Bobby Brown, Henry Cavill, Sam Claflin", "Amazing drama with lots and lots of dramatic moments.", "\n" +
                "September 23, 2020", "13 years and above", "/Assets/oldguard.jpg"));
        movies.add(new Movie("45.90", 10015, "The Old Guard", "Gina Prince-Bythewood", "Greg Rucka", MovieGenre.FANTASY, "2h 5min", "Charlize Theron, KiKi Layne, Matthias Schoenaerts", "Amazing movie, with many great reviews.", "\n" +
                "July 10, 2020", "16 years and above", "/Assets/enolaholmes.jpg"));
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Movie> getPage(int page, int pageSize) {
        int from = Math.max(0, page * pageSize);
        int to = Math.min(movies.size(), (page + 1) * pageSize);

        return movies.subList(from, to);
    }

    public int numberOfPages(int pageSize) {
        return (int) Math.ceil((double) movies.size() / pageSize);
    }

    public Movie getMovie(int id) {
        for (Movie movie : movies) {
            if (movie.getProductId() == id) {
                return movie;
            }
        }
        return null;
    }
}