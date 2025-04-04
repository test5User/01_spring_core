package by.itclass._01_base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("01_helloworld.xml");
        var df = ctx.getBean("default-message", String.class);
        var mes = ctx.getBean("message", String.class);
        System.out.println(df);
        System.out.println(mes);
    }
}
