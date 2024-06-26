package day5_6.section2;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {

/*  Math.random()함수를 이용해서 8시부터 11시 사이의 정수값을 발생시켜
	int time 변수에 할당한 후
	8이면 출근합니다.
	9면 회의를 합니다.
	10이면 업무를 봅니다.
	11이면 출장을 나갑니다.
	switch문 작성 */

		int time = (int)(Math.random()*4) + 8;

		switch (time) {
			case 8:
				System.out.println("출근합니다.");
				break;
			case 9:
				System.out.println("회의를 합니다.");
				break;
			case 10:
				System.out.println("업무를 봅니다.");
				break;
			case 11:
				System.out.println("출장을 나갑니다.");
				break;
		}



		}
	}
