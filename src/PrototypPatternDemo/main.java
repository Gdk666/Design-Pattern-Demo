package PrototypPatternDemo;

public class main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape"+ cloneShape.getType());
    }
}
