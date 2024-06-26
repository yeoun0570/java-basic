package day4.section5;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {

		/* 나눈셈, 나머지 연산에서 0으로 나눌경우 에외가(ArithmeticException) 발생
		무한대 값을 정수로 표현할 수 없다. 라는 의미
		NaN, Infinity*/

		int x = 10;
		double y = 0.0;

		double z = x / y;
		
		//잘못된 코드
		System.out.println(z + 2);
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)){
			System.out.println("값을 산출할 수 없는 데이터 입니다.");
		} else {
			System.out.println(z + 10);
		}

	}
}