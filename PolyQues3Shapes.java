package JavaClass;

public class PolyQues3Shapes {
    public void area() {
        System.out.println("The formula for area of ");
    }
    public void perimeter() {
        System.out.println("The formula for perimeter of ");
    }
}
class Triangle extends PolyQues3Shapes {
    public void area() {
        System.out.println("Triangle is ½ * base * height ");
    }
    public void perimeter() {
        System.out.println("Triangle is sum of sides ");
    }
}
class Circle extends PolyQues3Shapes {
    public void area() {
        System.out.println("Circle is 3.14 * radius * radius ");
    }
    public void perimeter() {
        System.out.println("Circle is 2 * 3.14 * radius ");
    }
}

class Square extends PolyQues3Shapes {
    public void area() {
        System.out.println("Square is side * side ");
    }
    public void perimeter() {
        System.out.println("Square is 4 * side");
    }
}
class MainClass {
    public static void main(String[] args) {
        PolyQues3Shapes myShape = new PolyQues3Shapes();  // Create a Shapes object
        PolyQues3Shapes myTriangle = new Triangle();  // Create a Triangle object
        PolyQues3Shapes myCircle = new Circle();  // Create a Circle object
        PolyQues3Shapes mySquare = new Square();
        myShape.area();
        myTriangle.area();
        myShape.area();
        myCircle.area();
        mySquare.perimeter();
        }
    }


