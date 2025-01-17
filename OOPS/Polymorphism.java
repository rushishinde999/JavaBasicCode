package OOPS;

//compile time =same name same class diff argu
//run time =same name diff class same argu
class Animal {
  String name;

  void eat() {
    System.out.println("animal is eating ");
  }

  void bark() {
    System.out.println("dog is barking  ");

  }

  void bark(String name) {
    System.out.println("dog is barking and his name is : " + name);

  }

}

class Dog extends Animal {

  void eat() {
    System.out.println("animal is eating ");
  }

  void bark() {
    System.out.println("dog is barking  ");

  }

}

public class Polymorphism {
  public static void main(String[] args) {
    Dog a = new Dog();

    a.eat();
    a.bark();
    a.bark("pitbull");

  }
}
