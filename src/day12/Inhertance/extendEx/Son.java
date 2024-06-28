package day12.Inhertance.extendEx;

public class Son extends Father{
  String name = "길동";
  void printDetails(){
    System.out.println("나의 이름은 " + familyName + name);
    System.out.println("나의 아버지는 프로그래머");
    System.out.println("나의 집은 " + houseAddress);

  }

}
