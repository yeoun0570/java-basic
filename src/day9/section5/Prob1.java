package day9.section5;

import java.util.Random;
import java.util.Scanner;

public class Prob1 {

  public static void main(String[] args) {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int oddTotal1 = 0;
    int evenTotal1 = 0;
    for (int i = 0; i < ia.length; i++) {
      if (ia[i] % 2 == 1) {
        oddTotal1 += ia[i];
      } else {
        evenTotal1 += ia[i];
      }
    }
    System.out.println("( 배열 ia )");
    System.out.printf("홀수의 합 : %d\n짝수의 합 : %d\n",oddTotal1,evenTotal1);

    int[] ib = new int[]{1, 2, 3, 4, 5};
    int oddTotal2 = 0;
    int evenTotal2 = 0;
    for (int i = 0; i < ib.length; i++) {
      if (ib[i] % 2 == 1) {
        oddTotal2 += ib[i];
      } else {
        evenTotal2 += ib[i];
      }
    }
    System.out.println("( 배열 ib )");
    System.out.printf("홀수의 합 : %d\n짝수의 합 : %d\n",oddTotal2,evenTotal2);

    System.out.println("=======================");
    int[] num = new int[5];
    Random random = new Random();

    for (int i =0; i< num.length; i++) {
      int randomNum = random.nextInt(100) + 1;
      num[i] = randomNum;
      System.out.print(num[i] + " ");
    }



  }
}

