package day15.interfaceEx.sec03;

public interface RemoteControl {

  //상수 필드
  public static final int MAX_VOLUME = 30;
  int MIN_VOLUME = 30;

  //추상 메소드
  abstract void turnOn();
  void turnOff();
  void setVolume(int volume);

}