package day15.interfaceEx.sec03;

public class Television implements RemoteControl{

  int volume;

  @Override
  public void turnOn() {
    System.out.println("TV의 전원을 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("TV의 전원을 끈다");
  }

  @Override
  public void setVolume(int volume) {
    if(volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    } else if (volume < RemoteControl.MIN_VOLUME){
      this.volume = RemoteControl.MIN_VOLUME;
    } else {
      this.volume = volume;
    }
    System.out.println("현재 TV의 볼륨 : " + this.volume);

  }

}	