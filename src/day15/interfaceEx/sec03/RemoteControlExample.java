package day15.interfaceEx.sec03;

public class RemoteControlExample {

  public static void main(String[] args) {
    //인터페이스 변수 선언
    RemoteControl remoteControl;
    Television myTV = new Television();
    Audio myAudio = new Audio();

    //Television 객체를 생성하고 인터페이스 변수에 대입
    remoteControl = myTV;
    remoteControl.turnOn();
    remoteControl.setVolume(20);
    remoteControl.turnOff();

    //Audio 객체를 생성하고 인터페이스 변수에 대입
    remoteControl = myAudio;
    remoteControl.turnOn();
    remoteControl.setVolume(20);
    remoteControl.turnOff();
  }
}