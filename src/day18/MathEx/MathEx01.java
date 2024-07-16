package day18.MathEx;

public class MathEx01 {

  public static void main(String[] args) {
    //절대값 반환 -1
    System.out.println(Math.abs(-1));

    //반올림 반환 1.4, 1.6, -1.5, 1
    System.out.println(Math.round(1.4));
    System.out.println(Math.round(1.6));
    System.out.println(Math.round(-1.5));
    System.out.println(Math.round(1));

    //올림 반환 1.4, 1.6, -1.5, 1
    System.out.println(Math.ceil(1.4));
    System.out.println(Math.ceil(1.6));
    System.out.println(Math.ceil(-1.5));
    System.out.println(Math.ceil(1));

    //내림 반환 1.4, 1.6, -1.5, 1
    System.out.println(Math.floor(1.4));
    System.out.println(Math.floor(1.6));
    System.out.println(Math.floor(-1.5));
    System.out.println(Math.floor(1));

    //제곱근 반환 : Math.sqrt()
    System.out.println((int) Math.sqrt(9));

    //난수 반환 1~10
    double random = Math.floor((Math.random() * 10) + 1);
    System.out.println((int) random);

  }

}
