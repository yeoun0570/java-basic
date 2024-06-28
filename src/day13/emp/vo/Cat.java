package day13.emp.vo;

public class Cat extends Animal {
  public Cat() {
    super();
  }

  public void eat() {
    System.out.println("Cat eat!");
  }

  public void night(){
    System.out.println("밤에는 고양이 눈이 빛반사를 해서 갑자기 마주치면 너무 무섭다.");
  }
}
