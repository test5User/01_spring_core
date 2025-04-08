package by.itclass._04_java;

import by.itclass._02_car.ComplexCar;
import by.itclass._02_car.Engine;
import by.itclass._02_car.SimpleCar;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class AppConfig {
    @Bean("defaultMessage")
    public String dMessage() {
        return "";
    }

    @Bean
    public String message() {
        return new String("Hello world");
    }

    @Bean
    public SimpleCar car1() {
        return new SimpleCar();
    }

    @Bean
    public Engine engine() {
        return new Engine();
    }

    @Bean
    public ComplexCar car2() {
        return new ComplexCar(engine());
    }

    @Bean
    public Library library() {
        return new Library("Leninka");
    }

    @Bean
    public List<Book> books() {
        return List.of(new Book("Title 1"), new Book("Title 2"));
    }
}
