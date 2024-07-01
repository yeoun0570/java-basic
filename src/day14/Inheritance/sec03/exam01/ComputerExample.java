package day14.Inheritance.sec03.exam01;

import day14.Inheritance.sec05.package2.C;

public class ComputerExample {

  public static void main(String[] args) {
    int radius = 10;
    Calculator calculator1 = new Calculator();
    System.out.printf("원 면적 : %.2f\n",calculator1.areaCircle(radius));

    System.out.println("===========Upcasting============");
    Calculator calculator2 = new Computer();
    double area = calculator2.areaCircle(20);
    System.out.printf("원 면적 : %.3f",area);

  }
}