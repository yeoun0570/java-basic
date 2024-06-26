package day5_6.section8;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. 사용자에게 원하는 단 하나만 입력받아 해당 단만 출력

        int dan = 0;

        for (int i = 2; i <= 2; i++) {
            dan = sc.nextInt();
            System.out.println("구구단 " + i + "단");

            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", dan, j, (dan * j));
            }
        }

        //2. 사용자에게 3~7단 해당 범위의 단만 출력

        int dan1 = 0;

        for (int i = 3; i <= 7; i++) {
            dan1 = sc.nextInt();
            System.out.println("구구단 " + i + "단");

            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", dan1, j, (dan1 * j));
            }
        }

    }
}
