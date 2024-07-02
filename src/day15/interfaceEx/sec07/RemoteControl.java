package day15.interfaceEx.sec07;

public interface RemoteControl {

  int MAX_VOLUME = 10;
  int MIDDLE_VOLUME = 5;
  int MIN_VOLUME = 0;

  //추상 메소드
  void turnOn();

  void turnOff();

  default void setVolume(int volume) {
    System.out.println("==볼륨 조정==");
    if (volume > MAX_VOLUME) {
      this.setVolume(MAX_VOLUME);
    } else if (volume < MIN_VOLUME) {
      this.setVolume(MIN_VOLUME);
    } else {
      this.setVolume(volume);
    }
  }

  default void setMute(boolean mute) {
    int volume;
    if(mute == true){
      volume = MIN_VOLUME;
    } else {
      volume = MIDDLE_VOLUME;
    }
  }
}