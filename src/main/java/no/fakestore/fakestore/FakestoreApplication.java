package no.fakestore.fakestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
