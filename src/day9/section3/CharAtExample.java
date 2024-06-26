package day9.section3;

public class CharAtExample {

  public static void main(String[] args) {
    String ssn = "0106241230123";
    //1. charAt() 통해서 "1230123"만 추출하여 출력하기
    String answer1 = "";
    for (int i = 6; i < ssn.length(); i++) {
      answer1 += ssn.charAt(i);
    }
    System.out.println(answer1);
    
    //2. 남성은 (1,3) 여성은 (2,4) 해당 인덱스를 추출하여 (1,3)은 "남성", (2,4)는 "여성" 출력

    if (ssn.charAt(6) == '1' || ssn.charAt(8) == '3') {
      System.out.println("남성");
    }
    if (ssn.charAt(4) == '2' || ssn.charAt(5) == '4') {
      System.out.println("여성");
    }



  }
}
