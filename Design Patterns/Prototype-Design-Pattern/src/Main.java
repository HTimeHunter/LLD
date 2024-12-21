import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes=new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle=new Circle();
        circle.x=10;
        circle.y=20;
        circle.radius=15;
        circle.color="yellow";
        shapes.add(circle);

        Circle circle2=(Circle) circle.clone();
        shapes.add(circle2);

        Rectangle rectangle=new Rectangle();
        rectangle.width=10;
        rectangle.height=20;
        rectangle.color="blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes,shapesCopy);
    }

    public static void cloneAndCompare(List<Shape>shapes,List<Shape> shapesCopy){
        for (Shape shape:shapes){
            shapesCopy.add(shape.clone());
        }

        for (int i=0;i<shapes.size();i++){
            if (shapes.get(i)!=shapesCopy.get((i))){
                System.out.println(i+": Shapes are different objects ");
                if (shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println(i+": And they are idential");
                } else {
                    System.out.println(i+": but they are not identical");
                }
            } else {
                System.out.println(i+" Shape objects are the same.");
            }
        }
    }
}