package day14.Inheritance.sec02.exam01;

public class SmartPhoneExample {

  public static void main(String[] args) {
    //SmartPhone 디폴트 생성자를 이용한 객체 생성과 필드값 셋팅 & 읽기
    SmartPhone smartPhone1 = new SmartPhone();
    smartPhone1.setModel("iPhone-16 Pro");
    smartPhone1.setColor("Yellow");
    System.out.println(smartPhone1.getModel() + "  " + smartPhone1.getColor());

    //SmartPhone 생성자 오버로딩을 이용한 객체 생성과 필드값 셋팅 & 읽기
    //Phone으로부터 상속받은 필드 읽기
    SmartPhone smartPhone2 = new SmartPhone("iPhone-16 Pro", "Yellow", false);

    System.out.println(smartPhone2.getModel() + "  " + smartPhone2.getColor() + "  " + smartPhone2.getWifi());


  }
}