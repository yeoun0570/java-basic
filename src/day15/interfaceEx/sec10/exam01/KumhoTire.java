package day15.interfaceEx.sec10.exam01;

public class KumhoTire implements Tire {

  //추상 메소드 재정의
  @Override
  public void roll() {
    System.out.println("금호 타이어가 굴러갑니다.");
  }
}