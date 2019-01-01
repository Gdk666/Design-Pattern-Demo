package PrototypPatternDemo;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.print("Circle");
    }
}
