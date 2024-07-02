package day15.interfaceEx.sec01;

public class Audio implements RemoteControl{
  //리모컨을 통해서 오디오의 전원을 켭니다.

  @Override
  public void turnOn() {
    System.out.println("오디오의 전원을 켠다");
  }
}