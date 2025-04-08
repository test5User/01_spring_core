package by.itclass._05_annotations;

import by.itclass._05_annotations.mvcbeans.ConnManager;
import by.itclass._05_annotations.mvcbeans.Controller;
import by.itclass._05_annotations.mvcbeans.Dao;
import by.itclass._05_annotations.mvcbeans.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //var ctx = new AnnotationConfigApplicationContext(ConnManager.class, Dao.class, Service.class, Controller.class);
        var ctx = new AnnotationConfigApplicationContext("by.itclass._05_annotations.mvcbeans");

//        var cm = ctx.getBean(ConnManager.class);
//        var dao = ctx.getBean(Dao.class);
//        var service = ctx.getBean(Service.class);
//        var controller = ctx.getBean(Controller.class);
//
//        System.out.println(cm);
//        System.out.println(dao);
//        System.out.println(service);
//        System.out.println(controller);

        System.out.println(ctx.getBean(Controller.class));
    }
}
