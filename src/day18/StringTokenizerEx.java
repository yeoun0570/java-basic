package day18;

import java.util.StringTokenizer;

public class StringTokenizerEx {

  public static void main(String[] args) {
    String data1 = "김창완&정수민&김지훈";
    //문제 1. & 토큰라이저 하여 학생이름을 1 김창완 2 정수민 3 김지훈 으로 출력하세요
    int no = 0;
    StringTokenizer st = new StringTokenizer(data1, "&");
    while(st.hasMoreTokens()) {
      String token = st.nextToken();
      no++;
      System.out.println(no + " " + token);
    }
    System.out.println("===============================");
    //문제2. 1번 문제 작업을 split() 메서드로 작업하시오

    String[] list = data1.split("&");
    int number = 0;
    for(String str : list) {
      number++;
      System.out.println(number + " " + str);
    }
  }

}
