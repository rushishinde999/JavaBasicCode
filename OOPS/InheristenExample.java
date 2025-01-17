package OOPS;

class Car {
  String Carname;

  void start() {
    System.out.println(Carname + "start the engine");
  }

  void drive() {
    System.out.println(Carname + "it is driving");
  }
}

class Music extends Car {

  void play() {
    System.out.println(Carname + "playing the music");
  }

}

public class InheristenExample {

  public static void main(String[] args) {
    Music m = new Music();

    m.Carname = "toyota ";
    m.start();
    m.drive();
    m.play();

  }
}
