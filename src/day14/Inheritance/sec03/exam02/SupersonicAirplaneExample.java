package day14.Inheritance.sec03.exam02;

public class SupersonicAirplaneExample {

  public static void main(String[] args) {
    SupersonicAirplane sa = new SupersonicAirplane();
    sa.takeOff();
    sa.fly();
    //sa.flyMode = SupersonicAirplane.SUPERSONIC;
    sa.setFlyMode(SupersonicAirplane.SUPERSONIC);
    sa.fly();
    //sa.flyMode = SupersonicAirplane.NORMAL;
    sa.setFlyMode(SupersonicAirplane.NORMAL);
    sa.fly();
    sa.land();
  }
}