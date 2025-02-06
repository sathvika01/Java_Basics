abstract class Shape {
    abstract int CalculateArea();

    void displayShape() {
        System.out.println("It has a shape of...");
    }
}

class Rectangle extends Shape{
    int l,b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }

    @Override
    int CalculateArea() {
        return l*b;

    }
    int Area(){
        return l*l;
    }
}

public class Abstraction {
    public static void main(String[] args){
        Shape obj = new Rectangle(4,9);
        obj.displayShape();
        System.out.println(obj.CalculateArea());
        Rectangle obj1 = new Rectangle(8,9);

        System.out.println(obj1.Area());
    }
}
