package day13.emp.vo;

public class Dog extends Animal{
  public Dog() {
    super();
  }

  /* Override (재정의):
   * Super class의 동일한 이름을 가진(파라미터, 파라미터 타입까지 똑같아야함)
   * 메서드를 재정의 */
  public void eat() {
    System.out.println("Dog eat!");
  }
}
