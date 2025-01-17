package OOPS;

//same name same class ,diff argument
//same name=bark()
//same class Animal class conatin same method
// diff argument =vod bark conatin diff parameter i.e no para and one para String 
class Animal {
  String name;

  void bark() {
    System.out.println("Animal " + name + " is barking");
  }

  void bark(String type) {
    System.out.println("Animal " + type + " is barking");
  }

}

public class CompileTimePoly {

  public static void main(String[] args) {

    Animal a = new Animal();
    a.name = "Dog";
    a.bark();
    a.bark("pitbull");

  }
}
