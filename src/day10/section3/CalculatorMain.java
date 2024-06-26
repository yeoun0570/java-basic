package day10.section3;

import java.sql.SQLOutput;

public class CalculatorMain {

  public static void main(String[] args) {

    //1. 계산기 한개를 생성합니다.
    Calculator cal = new Calculator();
    //2. 계산기의 전원을 켭니다.
    cal.poweron();
    //3. 두 개의 정수를 전달하여 계산한 결과값을 출력
    int result = cal.plus(10,20);
    System.out.printf("결과 값 : %d\n",result);
    //4. 두 개의 실수를 전달하여 계산한 결과값을 출력
    double result2 = cal.divde(1,0);
    System.out.printf("결과 값 : %.1f\n",result2);

    //5. 계산기의 전원을 끕니다.
    cal.poweroff();
  }
}
