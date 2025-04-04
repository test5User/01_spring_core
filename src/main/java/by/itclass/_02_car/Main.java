package by.itclass._02_car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("02_car.xml");
        var cars = List.of(
                ctx.getBean("car1", SimpleCar.class),
                ctx.getBean("car2", SimpleCar.class),
                ctx.getBean("car3", SimpleCar.class),
                ctx.getBean("car4", SimpleCar.class),
                ctx.getBean("car5", SimpleCar.class)
        );
        cars.forEach(System.out::println);
        System.out.println();
        System.out.println(ctx.getBean("car6", ComplexCar.class));
    }
}
