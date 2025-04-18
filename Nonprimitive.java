package DataTypes;

//Non-Primitive Data Types Summary:

//Classes: Define the structure and behavior of objects.

//Interfaces: Define a contract that classes can implement.

//Arrays: Stores multiple elements of the same type.

//Enums: Define a fixed set of constants.

//Define a class called 'Person'
class Person {
 // Fields of the class
 String name;
 int age;

 // Constructor to initialize the values
 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display person's details
 void display() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

public class Nonprimitive {
 public static void main(String[] args) {
     // Creating an object of the class 'Person' (non-primitive data type)
     Person person1 = new Person("Alice", 30);

     // Accessing the method of the 'Person' object
     person1.display();  // Output will show "Name: Alice" and "Age: 30"
     
     // Another object example
     Person person2 = new Person("Bob", 25);
     person2.display();  // Output will show "Name: Bob" and "Age: 25"
 }
}

