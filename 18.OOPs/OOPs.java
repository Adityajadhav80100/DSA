public class OOPs {
    public static void main(String arg[]) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.tip = 5;
        System.out.println(pen1.color);
        System.out.println(pen1.tip);

        BankAccount Acc1 = new BankAccount();
        Acc1.userName = "Rohit";
        // Acc1.password = "1234"; // This will give an error because password is
        // private

        Acc1.setPassword("1234"); // This is the correct way to set the password

        // Non parametrized constructor invoked
        Student s1 = new Student();
        s1.marks = new int[3];
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // Shallow copy constructor invoked
        s1.marks[0] = 99; // This will change the marks of s2 as well because it is a shallow copy

        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }

        // Deep copy constructor invoked
        Student s3 = new Student(s1);

        // // Parametrized contructor invoked
        // Student s2 = new Student("Rohit");
        // System.out.println(s2.name);

        // Student s3 = new Student(20);
        // System.out.println(s3.age);

        // 2. Inheritance

        Dog d1 = new Dog();
        d1.sleep();

        // Method Overloading in Polymorphism
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 10));
        System.out.println(calc.sum((float) 5.6, (float) 10.11));
        System.out.println(calc.sum(5, 10, 15));

        // Method Overriding in Polymorphism
        dog d2 = new dog();
        d2.eat(); // This will call the eat method of dog class and not animal

        // Abstraction
        bird b1 = new bird();
        b1.makeSound(); // This will call the makeSound method of bird class and not animal
        b1.eat(); // This will call the eat method of animal class because it is not abstract
        System.out.println(b1.color); // This will show color of animal class because it is not abstract

        // interFaces
        Queen q1 = new Queen();
        q1.moves();
    }

}

// Contructor
class Student {
    String name;
    int age;
    int marks[];

    // Non parametrized Constructor
    Student() {
        System.out.println("Constructor Invoked");
    }

    // // parametrized Constructor
    // Student(String name) {
    // this.name = name;
    // }

    // Student(int age) {
    // this.age = age;
    // }

    // // Shallow copy constructor
    // Student(Student s1) {
    // this.name = s1.name;
    // this.age = s1.age;
    // this.marks = s1.marks;
    // }

    // Deep copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}

// Access Modifiers
class BankAccount {
    public String userName;
    private String password;

    // but to access we can use fuunction
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void ChangeColor(String newColor) {
        color = newColor;
    }

    void SetTip(int newTip) {
        tip = newTip;
    }

}

// 2. Inheritance
// base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// derived class
class mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

// derived class

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Polymorphism
// 1. method overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// 2. method overriding
class animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class dog extends animal {
    void eat() {
        System.out.println("Dog is eating");
    }
}

// Abstraction class

abstract class animaal {

    // Contructor
    String color;

    animaal() {
        color = "brown";
    }

    void eat() {
        System.out.println("Animal is eating");
    }

    abstract void makeSound(); // we do not define the body of this function
                               // because it is abstract and will be defined in the derived class
}

class bird extends animaal {
    void ChangeColor() {
        color = "Yellow";
    }

    void makeSound() {
        System.out.println("Bird is making sound");
    }
}

// Interfaces
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen can move in any direction");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Rook can move in straight lines");
    }
}