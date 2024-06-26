package day10.section3;

public class Calculator {

  //리턴값이 없는 메소드 선언 : public
  //메소드 이름 : poweron()
  //실행 : "전원을 켭니다."

  public String poweron() {
    String poweron = "전원을 켭니다.";
    System.out.println(poweron);
    return poweron;
  }


  //리턴값이 없는 메소드 선언 : public
  //메소드 이름 : poweroff()
  //실행 : "전원을 끕니다."
  public String poweroff() {
    String powerff = "전원을 끕니다.";
    System.out.println(powerff);
    return powerff;
  }


  //호출 시 두 정수를 전달받고 두 값을 더하여, 결과값을 int로 결과값을 반환 메소드 선언
  //메소드 이름 : plus()
  int plus(int num1, int num2) {
    int result = num1 + num2;
    return result;
  }

  //호출 시 두 실수를 전달받고 두 값을 나누어 결과값을 double로 반환 메소드 선언
  //메소드 이름 : divide()
  double divde(double num1, double num2) {
    double result = num1 / num2;
    if(num2 == 0) {
      return 0;
    }
    return result;
  }

}