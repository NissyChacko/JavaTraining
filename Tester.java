class Shape { // Base class
   public void display() {
      System.out.println("from Base class: Shape");
   }
}
class Rectangle extends Shape {  // Derived class (extends from base class 'shape')
   public void area() {
      System.out.println("This is from Derived class: Recatangle");
   }
}
public class Tester {
   public static void main(String[] arguments) {
      Rectangle rect = new Rectangle();
      rect.display();
      rect.area();
   }
}