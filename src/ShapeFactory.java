public class ShapeFactory {
    public Shapes getShape(String type){
        if("square".equals(type)){
            return new Square();
        }else if("rectangle".equals(type)){
            return new Rectangle();
        }else {
            return new Square();
        }
    }
}
