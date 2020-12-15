package shapes;

public class ShapesTest {

    public static void main(String[] args){


        Measurable myShape = new Rectangle(8,10);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

         myShape = new Square(9);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());




//        Rectangle box1 = new Rectangle(4,5);
//
//
//        System.out.println("Rec perimeter "+box1.getPerimeter());
//        System.out.println("Rec area "+box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Square perimeter "+box2.getPerimeter());
//        System.out.println("Square area "+box2.getArea());




    }
}
