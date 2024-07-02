package day14.Inheritance.sec07.exam02;

import day14.Inheritance.sec05.package2.D;

public class DriverExample {

  public static void main(String[] args) {
    //Driver 객체 생성
    Driver driver = new Driver();

    //매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
    Bus bus = new Bus();
    driver.Driver(bus);

    //매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
    Taxi taxi = new Taxi();
    driver.Driver(taxi);
    driver.Driver((Vehicle) taxi);

    //문제) 택시와 버스를 운전할 수 있는 기사가 있습니다.
    //     기사가 낮엔 택시, 밤엔 버스를 운전하도록 클래스를 설계하고 기능을 구현하세요.



  }
}