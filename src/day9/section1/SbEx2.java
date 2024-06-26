package day9.section1;

public class SbEx2 {

  public static void main(String[] args) {
    String str1 = "ABCDEFGHIJKLMN";
    StringBuilder sb1 = new StringBuilder(str1);

    //sb1을 String 타입으로 캐스팅하세요
    String str2 = sb1.toString();
    System.out.println(str2);

    //D부터 J까지 출력
    String str3 = sb1.substring(sb1.indexOf("D"), sb1.indexOf("K"));
    System.out.println(str3);

    //"OPQRSTU" 문자열 추가하기
    sb1.insert(sb1.indexOf("C"), "OPQRSTU");
    String str4 = sb1.toString();
    System.out.println(str4);

    //현재 sb1의 문자열에서 문자 O부터 I까지 삭제한 결과값 출력
    sb1.delete(sb1.indexOf("O"), sb1.indexOf("J"));
    String str5 = sb1.toString();
    System.out.println(str5);

    //현재 sb1 문자열에 "ABJKLMN" --> "ABJKLMNOPQRSTU"로 변경연산하기
    sb1.append("OPQRSTU");
    String str6 = sb1.toString();
    System.out.println(str6);

    //현재 sb1의 문자열의 총길이 출력
    System.out.println(sb1.length());

    //현재 sb1의 용량(capacity) 출력
    System.out.println(sb1.capacity());

    //현재 sb1을 거꾸로 출력
    sb1.reverse();
    String str7 = sb1.toString();
    System.out.println(str7);

  }

}
