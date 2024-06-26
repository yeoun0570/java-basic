package day4.section7;

import java.util.Scanner;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode1 = 'A';
		int charCode2 = 'a';
		int charCode3 = '5';

		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 숫자 한 자를 입력하세요!");
		int result = sc.next().charAt(0);
		
		//1. 입력받은 문자가 대/소문자 구분하여 "대문자 '입력값'", "소문자 '입력값'"으로 출력
		
		if ('A' <= result && result <= 'Z') {
			System.out.println("대문자 " + (char)result);
		} else if (charCode2 <= result && result <= charCode2 + 26){
			System.out.println("소문자 " + (char)result);
		}

		//2. 입력받은 문자가 알파벳/숫자 혹은 대소문자를 구분하여 숫자면 숫자, 대문자면 대문자, 소문자면 소문자
		System.out.print("문자(알파벳), 숫자(0~9) 하나를 입력하세요!");

		int result1 = sc.next().charAt(0);

		if ('A' <= result1 && 'Z' >= result1) {
			System.out.println("대문자 " + (char)result1);
		} else if ('a' <= result1 && 'z' >= result1) {
			System.out.println("소문자 " + (char)result1);
		} else if ('0' <= result1 && '9' >= result1) {
			System.out.println("숫자 " + (char)result1);
		}

		//3. 입력받은 숫자가 2의 배수 또는 3의 배수인지 검사하여 "ok" 혹은 "Oops.."로 출력
		System.out.print("숫자 하나를 입력하세요: ");
		int result2 = sc.next().charAt(0);

		if (result2 % 2 == 0 || result2 % 3 ==0){
			System.out.println("ok");
		} else {
			System.out.println("Oops..");
		}


		
		//----------------------------------------------------------

		// int value = 6;


	}
}