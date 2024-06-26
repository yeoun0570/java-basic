package day4.section3;

public class OverflowUnderflowExample {
	public static void main(String[] args) {
/*		byte var1 = 125;
		for(int i=0; i < 5 ; i++ ){
			var1++;
			System.out.println("var = " + var1);
			System.out.println(i);
		}

		System.out.println("-----------------------");

		byte var2 = -125;
		for (int i=0; i < 5; i++){
			var2--;
			System.out.println("var2 = " + var2);
			System.out.println(i);
		}*/

		long xx = 10000000;
		int yy = 10000000;
		long zz = xx * yy;
		System.out.println(zz);

	}
}