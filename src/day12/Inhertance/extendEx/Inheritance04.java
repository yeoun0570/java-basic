package day12.Inhertance.extendEx;

class Parent {
  String name = "홍길순";
  void details() {
    System.out.println(this.name);
  }

}
class Child extends Parent{
  String name = "홍길동";
  void details() {
    super.details(); //부모의 details()메서드를 사용하는 모습
    System.out.println(this.name);
  }
  void printDetails() {
    details();
    System.out.println("부모 이름 : " + super.name);
    System.out.println("자식 이름 : " + this.name);
  }

}
public class Inheritance04 extends Child{

  public static void main(String[] args) {
    Child child = new Child();

    child.printDetails();

  }
}