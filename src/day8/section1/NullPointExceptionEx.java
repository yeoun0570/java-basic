package day8.section1;

public class NullPointExceptionEx {

  public static void main(String[] args) {
    int[] intArray = null;
    intArray = new int[5];
    int[] intArrayClone = intArray;
    System.out.println(intArray + " " + intArray.hashCode());

    intArray[0] = 10;
    intArray[1] = 20;
    intArray[2] = 30;
    intArray[3] = 40;
    intArray[4] = 50;

    for (int value : intArrayClone) {
      System.out.println(value);
    } //for문 종료

    if (intArray == intArrayClone) {
      System.out.println("주소값이 같다.");
    } else {
      System.out.println("주소값이 다르다.");
    } //if문 종료

    intArrayClone = null;
    for (int value : intArrayClone) {
      System.out.println(value);
    } //for문 종료


  }//main종료
}//클래스 종료
