package DecoratorPatternDemo;

public class mian {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new RedShapeDecorator(new Circle());
        Shape re = new RedShapeDecorator(new Rectangle());
        System.out.println("-----Circle with norm border");
        c.draw();
        System.out.println("-----Circle of red border");
        r.draw();
    }
}
