package OOPS;

//abstract class contain abstract method 
abstract class Animal {

  String name;

  abstract void bark();

  // concrete method
  void eat() {
    System.out.println(name + "  is eating ");
  }
}

class dog extends Animal {
  void bark() {
    System.out.println(name + "  is barking ");
  }
}

class cat extends Animal {
  void bark() {
    System.out.println(name + "  is meowww.. ");
  }
}

public class Abstraction {

  public static void main(String[] args) {

    cat c = new cat();
    c.name = "cat";
    c.bark();
    c.eat();

    dog d = new dog();
    d.name = "pitbull";
    d.bark();
    c.eat();

  }
}
