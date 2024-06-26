package day5_6.section1;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*40) + 61;
		/*입력된 score 점수를 확인하여 95~100 A+, 90~94 A,
		85~89 B+, 80~84 B,
		75~79 C+, 70~74 C,
		70미만은 F처리하는 프로그램을 작성하시고,
		최종결과는 C이상의 학점은 "당신의 학점은 x 입니다." 출력하고
		C미만의 학점은 "재수강 하세요!" 출력*/


		System.out.println("점수: " + score);
		String grade;

		if (90 <= score) {

			if (95 <= score){
				grade = "A+";
			} else {
				grade = "A";
			}

		} else if (80 <= score) {

			if (85 <= score) {
				grade = "B+";
			} else {
				grade = "B";
			}

		} else if (70 <= score){

			if (75 <= score) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "F";
			System.out.println("재수강 하세요!");
		}

		System.out.println("학점: " + grade);
	}
}