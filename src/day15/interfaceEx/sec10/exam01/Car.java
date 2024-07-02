package day15.interfaceEx.sec10.exam01;

public class Car{

  //필드
  Tire tire = new HankookTire();

  public Car(Tire tire) {
    this.tire = tire;
  }

  //메소드
  void run() {
    tire.roll();
  }

}