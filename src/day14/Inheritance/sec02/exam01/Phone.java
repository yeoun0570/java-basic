package day14.Inheritance.sec02.exam01;

public class Phone {

  //필드 선언
  private String model;
  private String color;

  //기본 생성자 선언
  public Phone() {
  }

  // 해당 클래스의 두 필드를 초기화하는 생성자 오버로딩
  public Phone(String model, String color){
    this.model = model;
    this.color = color;
  }

  // 두 필드를 접근할 수 있는 getter, setter
  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }


}