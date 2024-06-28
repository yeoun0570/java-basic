package day12.Inhertance.extendEx;

class GrandFather {
  String printGrandFather = "나는 할아버지입니다.";

}
class SubFather extends GrandFather{
  String familyName = "홍";
  String houseAddress = "인천";
  void printFather() {
    System.out.println("나는 집은 " + houseAddress);
    System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
  }

}
class SubSon extends SubFather{
    void printSon() {
      System.out.println("나는 아들입니다.");
      System.out.println("나는 아버지로부터 상속받습니다.");
      System.out.println("나의 아버지는 프로그래머");
      System.out.println("나의 집은 " + houseAddress);
    }
}
public class Inheritance03 extends SubSon{

  public static void main(String[] args) {
    SubSon son = new SubSon();

    son.printSon();
    son.printFather();
    System.out.println(son.printGrandFather);

  }
}