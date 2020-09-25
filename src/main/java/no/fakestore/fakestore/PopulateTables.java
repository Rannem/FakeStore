package no.fakestore.fakestore;

import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
import no.fakestore.fakestore.Repos.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class PopulateTables {

    private BookRepo bookRepo;
    private MovieRepo movieRepo;
    private GameRepo gameRepo;
    private UserRepository userRepository;

    public PopulateTables(BookRepo bookRepo, MovieRepo movieRepo, GameRepo gameRepo, UserRepository userRepository) {
        this.bookRepo = bookRepo;
        this.movieRepo = movieRepo;
        this.gameRepo = gameRepo;
        this.userRepository = userRepository;
    }

    public void populate() {
        bookRepo.save(new Book("21.99", "Fox in Sox", "Dr.Seuss", "Random House", BookGenre.CHILDREN, "Awesome children's book.", "June 19, 1965", "English", "For all ages.", "/Assets/foxinsox.png"));
        bookRepo.save(new Book("69.69", "Peer to peer", "A. Moberg", "Academy", BookGenre.ROMANCE, "A close up interview.", "June 19, 1998", "Norwegian", "18+", "/Assets/moberg.jpg"));
        bookRepo.save(new Book("24.49", "The Audacity of Hope", "B. Obama", "White House", BookGenre.THRILLER, "Thoughts on Reclaiming the American Dream.", "September 25, 2006", "English", "For all ages.", "/Assets/obamabook.jpg"));
        bookRepo.save(new Book("54.49", "Klovn i kamp", "Lill Smith", "ABC", BookGenre.HISTORY, "A mad man in power.", "May 19, 20018", "Norwegian", "For all ages.", "/Assets/donald.jpg"));

        movieRepo.save(new Movie("39.99", "Tenet", "Christopher Nolan", "Christopher Nolan", MovieGenre.ACTION, "2h 30min", "John David Washington, Robert Pattinson, Elizabeth Debicki", "Amazing movie, starring amazing actors.", "August 28, 2020", "12 years and above", "/Assets/tenet.jpg"));
        movieRepo.save(new Movie("64.49", "No Time to Die", "Cary Joji Fukunaga", "Neal Purvis, Robert Wade", MovieGenre.THRILLER, "2h 43min", " Ana de Armas, Daniel Craig, Léa Seydoux", "Amazing action movie, with tons of action.", "November 12, 2020", "16 years and above", "/Assets/bond.jpg"));
        movieRepo.save(new Movie("49.99", "Enola Holmes", "Harry Bradbeer", "Nancy Springer, Jack Thorne", MovieGenre.DRAMA, "2h 3min", "Millie Bobby Brown, Henry Cavill, Sam Claflin", "Amazing drama with lots and lots of dramatic moments.", "September 23, 2020", "13 years and above", "/Assets/oldguard.jpg"));
        movieRepo.save(new Movie("44.49", "The Old Guard", "Gina Prince-Bythewood", "Greg Rucka", MovieGenre.FANTASY, "2h 5min", "Charlize Theron, KiKi Layne, Matthias Schoenaerts", "Amazing movie, with many great reviews.", "July 10, 2020", "16 years and above", "/Assets/enolaholmes.jpg"));

        gameRepo.save(new Game("49.99", "Minecraft", "Mojang AB", "PC, Console", GameGenre.SANDBOX, "Amazing sandbox game with zombies.", "November 19, 2009", "Suitable for 7+", "/Assets/minecraft.jpg"));
        gameRepo.save(new Game("49.99", "Watch Dogs 2", "Ubisoft", "PS4, Xbox", GameGenre.RPG, "A 2016 action-adventure game.", "November 15, 2016", "Suitable for 16+", "/Assets/WatchDogs.jpg"));
        gameRepo.save(new Game("29.99", "Inertial Drift", "PQube", "PS4, Xbox, Switch", GameGenre.SPORTS, "It's been a long road but we're finally here.", "September 11, 2020", "Suitable for 7+", "/Assets/inertial.jpg"));
        gameRepo.save(new Game("49.99", "Past Cure", "Phantom 8 Studio", "PC", GameGenre.ACTION, "A former elite soldier tries to uncover his past.", "February 23, 2018", "Suitable for 18+", "/Assets/Pastcure.jpg"));

        userRepository.save(new User("Sindre Broholm", "Sæther", Gender.MALE, "Sindreset@gmail.com", "004793071137", "1993-07-19", "sindre", "123", "123", "Movollen 100","7091"));

    }
}
