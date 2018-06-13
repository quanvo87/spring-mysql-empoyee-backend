package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        System.setProperty("javax.net.ssl.trustStore", "/Users/quanvo/IBM/mysqlstore");
        System.setProperty("javax.net.ssl.trustStorePassword", "mysqlpass");

        SpringApplication.run(Application.class, args);
    }
}