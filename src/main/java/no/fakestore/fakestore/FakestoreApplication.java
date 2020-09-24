package no.fakestore.fakestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class FakestoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FakestoreApplication.class, args);
    }

}
