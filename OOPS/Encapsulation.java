package OOPS;

class Emp {
  private int id;
  private String name;

  // getter and setter
  // get the value and set the value
  // getter has return type and setter has no return type
  public int getid() {
    return id;
  }

  public void setid(int id) {
    this.id = id;

  }

  public String getname() {
    return name;

  }

  public void setname(String name) {
    this.name = name;
  }

}

public class Encapsulation {
  public static void main(String[] args) {
    Emp e = new Emp();
    e.setid(1);
    e.setname("Rushi");

    System.out.println("My Id is : " + e.getid());
    System.out.println("My Id is : " + e.getname());

  }
}
