package day14.Inheritance.sec02.exam01;

public class SmartPhone extends Phone {

  private boolean wifi;

  //자식 생성자 선언
  public SmartPhone() {}

  public SmartPhone(String model, String color, boolean wifi) {
    super(model, color);
    this.wifi = wifi;
  }

  public String getWifi() {
    String message = "";
    if(this.wifi == true){
      message = "Wifi 켜짐";
    } else {
      message = "Wifi 꺼짐";
    }
    return message;
  }
  public void setWifi(boolean wifi) {
    this.wifi = wifi;
    if(this.wifi == true) {
      System.out.println("Wifi 상태정보 on ");
    } else {
      System.out.println("Wifi 상태정보 off ");
    }
  }

}