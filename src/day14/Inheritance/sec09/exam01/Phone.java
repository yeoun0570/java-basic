package day14.Inheritance.sec09.exam01;

public abstract class Phone {

  //필드 선언
  String owner;

  //생성자 선언
  public Phone() {}

  Phone(String owner) {
    this.owner = owner;
  }

  abstract void sendVoice(); // body{}가 없으니 추상메서드로 봄 --> 디자인 개념
  abstract void receiveVoice(); // body{}가 없으니 추상메서드로 봄 --> 디자인 개념

  void calling() {} //애는 body{}가 있으니 추상메서드가 아님

  //메소드 선언
  void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}