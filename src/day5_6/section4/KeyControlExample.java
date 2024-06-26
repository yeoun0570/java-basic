package day5_6.section4;

import java.util.*;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //키보드로부터 입력받은 숫자가 짝수인지 홀수인지 판별하고, 계속 입력 진행할지 여부를 선택하기 위한 프로그램 - while
        //종료 조건: 계속 입력을 받고 싶다면 1번 선택 끝내고 싶다면 0번을 입력하기

        boolean quit = false;
        int choice = 1;

        while (choice == 1) {
            System.out.print("짝/홀수 구분을 위한 숫자를 입력해주세요 : ");
            int a = sc.nextInt();

            if (a % 2 == 0) {
                System.out.println(a + "(은)는 짝수");
            } else if (a % 2 != 0 && a != 0) {
                System.out.println(a + "(은)는 홀수");
            }

            System.out.print("0과 1중에 선택해주세요. 0은 숫자 종료, 1은 재선택 : ");
            choice = sc.nextInt();

        } // while 종료

    }


}
