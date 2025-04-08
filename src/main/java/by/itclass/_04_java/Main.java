package by.itclass._04_java;

import by.itclass._02_car.ComplexCar;
import by.itclass._02_car.SimpleCar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ctx.getBean("defaultMessage", String.class));
        System.out.println(ctx.getBean("message", String.class));
        System.out.println(ctx.getBean("car1", SimpleCar.class));
        System.out.println(ctx.getBean("car2", ComplexCar.class));

        System.out.println(ctx.getBean(Library.class));
    }
}
