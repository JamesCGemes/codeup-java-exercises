package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return this.width * 2;
    }

    @Override
    public double getArea() {
        return 4 * this.length;
    }

    //        public Square(int side){
//            super(side,side);
//        }
//
//        @Override
//        public double getArea(){
//            System.out.println("over ridden area ");
//            return width * width;
//        }
//
//        @Override
//        public double getPerimeter(){
//            System.out.println("over ridden perimeter ");
//            return 4 * length;
//        }
}
