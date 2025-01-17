package OOPS;
//same name with diff class and same parameter

class Animal {

  void eat() {
    System.out.println("Animal is eating");
  }
}

class Dog extends Animal {
  void eat() {
    System.out.println("Dog is eating");
  }

}

public class RunTimePoly {

  public static void main(String[] args) {
    Animal a = new Dog(); // parent class refer to child class
    a.eat(); // dog class method print
  }

}
