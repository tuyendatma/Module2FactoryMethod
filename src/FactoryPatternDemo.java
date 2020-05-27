public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shapes square = shapeFactory.getShape("square");
        square.draw();
        Shapes rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        Shapes circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
