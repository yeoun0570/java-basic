package day9.section1;

public class SbEx {

  public static void main(String[] args) {

    //StringBuffer, StringBuilder 클래스는 문자열 연산(연결,변경,수정)에 주로 사용되는 클래스이다.

    //String클래스에서 연산자는 +, concat() : 문자열을 이어 붙여서 사옹함
    //기존에 있던 문자열은 그대로 있고 새로운 문자열을 생성하는 방식이라 비효율적이다.

    /*StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(" StringBuffer");
    sb.append(" Nice to meet you");
    sb.append(" !!!");
    String result = sb.toString();
    String result2 = String.valueOf(sb);
    System.out.println(result);
    System.out.println(result2);*/

    String str1 = "ABCDEFGHIJKLMN";
    StringBuffer sb1 = new StringBuffer(str1);

    //sb1을 String 타입으로 캐스팅하세요
    String str2 = sb1.toString();
    String str3 = sb1.substring(3); //substring을 사용하면 해당 인자값부터 출력한다
    System.out.println(str3); //D부터 시작해서 출력하기
    
    String str4 = sb1.substring(str1.indexOf("D"), str1.indexOf("K")); //substring의 두번째 인자값은 n-1까지 출력한다 
    System.out.println(str4); //D부터 J까지 출력
    
    sb1.insert(2,"OPQRSTU"); //insert로 B 이후부터 해당 문자열 추가하기
    String str5 = sb1.toString(); // 추가된 StringBuffer를 String으로 캐스팅
    System.out.println(str5);

    //현재 sb1의 문자열에서 문자 O부터 I까지 삭제한 결과값 출력
    sb1.delete(sb1.indexOf("O"), sb1.indexOf("J")); //delete역시 두번째 인자값은 n-1까지
    String str6 = sb1.toString();
    System.out.println(str6);

    //현재 sb1 문자열에 "ABJKLMN" --> "ABJKLMNOPQRSTU"로 변경연산하기
    sb1.append("OPQRSTU");
    String str7 = sb1.toString();
    System.out.println(str7);

    //현재 sb1의 문자열의 총길이 출력
    int length = sb1.length();
    System.out.println(length);
    
    //현재 sb1의 용량(capacity) 출력
    int capacity = sb1.capacity();
    System.out.println(capacity);

    //현재 sb1을 거꾸로 출력
    sb1.reverse();
    String str8 = sb1.toString();
    System.out.println(str8);
  }
}
