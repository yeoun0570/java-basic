package day4.section1;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = +10;
		int y = +10;
		int z;

		++x; //전치증가:	x = x + 1
		System.out.println(x);
		x++; //후치증가:	x = x + 1
		System.out.println(x);

		--x;
		System.out.println(x);
		x--;
		System.out.println(x);

		//여러개의 연산자가 포함된 연산식에서는 증감연산자의 위치에 따라 결과가 달라진다.
		int a = 1;
		int b = 1;

		int result1 = ++a + 10;	//a = 12 => a = a+1 --> 2 + 10
		System.out.println(result1);
		int result2 = b++ + 10;	//b = 11 => int result2 --> 1 + 10 // b = b + 1
		System.out.println(result2);
		System.out.println(b);

		x = 1;
		y = 1;
		z = ++x + y++;
		System.out.println(x + " " + y + " " + z);


	}
}