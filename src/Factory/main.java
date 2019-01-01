package Factory;

import com.sun.jmx.snmp.tasks.ThreadService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();
        ExecutorService threadService = Executors.newCachedThreadPool();

        //language=JSON
        String jsonString = "{\"name\":\"111\",\"123\":\"\"}";

    }
}
