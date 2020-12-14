package shapes;

public class Square extends Rectangle {
        public Square(int side){
            super(side,side);
        }

        @Override
        public double getArea(){
            System.out.println("over ridden area ");
            return this.width * this.width;
        }

        @Override
        public double getPerimeter(){
            System.out.println("over ridden perimeter ");
            return 4 * this.length;
        }
}
