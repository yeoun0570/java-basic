package day11.exec.aa;

public class B {
  protected String bb = "bb";

  public void bb() {
    System.out.println("B클래스의 bb() 메소드 실행");
  }

  @Override
  public String toString() {
    return "B{" +
        "bb='" + bb + '\'' +
        '}';
  }
}
