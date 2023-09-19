import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    Scanner myScanObj = new Scanner(System.in);

    Student student1=New Student{}

    System.out.println("Enter name, age and salary:");
    // String input fir name
    String name = myScanObj.nextLine();

    // Numerical input for age
    int age = myScanObj.nextInt();
    // Numerical input for salary
    double salary = myScanObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}