package day5_6.section3;

import java.util.Scanner;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//키보드로부터 입력받은 5개의 숫자의 합을 출력하는 프로그램을 작성하세요. for사용

		int num = 0;
		int sum = 0;

		for (int i =0; i<5; i++) {
			num = sc.nextInt();
			sum += num;
		}
		System.out.println(sum);


	}
 }
 /*		int sum = 0;

		for (int i=1; i<=100; i++) {
			sum += i;
			System.out.printf("sum: %d, i: %d\n",sum,i);
		}
		System.out.printf("totalsum: %d",sum);*/