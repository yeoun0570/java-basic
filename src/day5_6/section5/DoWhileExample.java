package day5_6.section5;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		//do-while문은 while문과 for문처럼 조건식에 의해 반복된다는 점은 비슷하다.
		//차이점은 조건식을 확인하기 전에 코드 블록의 코드가 한 번 실행된다.

		/*int i = 1;
		do{
			System.out.println("Hello Java!");
			i++;
		} while (i<6);*/

		//키보드로부터 10보다 큰수를 입력받아 해당 수보다 10큰수 까지의 합을 구하기 위한 do-while 프로그램을 작성해 주세요.

		System.out.println("10보다 큰 수를 입력해 주세요.");
		int num = sc.nextInt();
		int sum = 0;

		do {
			sum += num;
			num--;
		} while (10<=num);
		System.out.println("sum : " + sum);



	}
}