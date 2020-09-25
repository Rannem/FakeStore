package no.fakestore.fakestore;

import no.fakestore.fakestore.Repos.BookRepo;
import no.fakestore.fakestore.Repos.GameRepo;
import no.fakestore.fakestore.Repos.MovieRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class FakestoreApplication {

    private static PopulateTables populateTables;

    public FakestoreApplication(PopulateTables populateTables) {
        this.populateTables = populateTables;
    }

    public static void main(String[] args) {
        SpringApplication.run(FakestoreApplication.class, args);
        populateTables.populate();
    }

}
