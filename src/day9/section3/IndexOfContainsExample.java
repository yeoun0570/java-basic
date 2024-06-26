package day9.section3;

public class IndexOfContainsExample {

  public static void main(String[] args) {
    String subject = "자바 객체 프로그래밍 과목입니다.";

    //1. 문제에서 "객체 프로그래밍" 문자열을 추출하여 저장하고 추출하세요
    String s = subject.substring(subject.indexOf("객"), 11);
    System.out.println(s);

    //2. subject 문자열에서 "프로그래밍" 문자열의 첫인덱스를 저장하여 "프로그래밍 과목입니다." 문자열을 추출하여 출력하세요
    int start = subject.indexOf("프로그래밍");
    System.out.println(subject.substring(start));

    //3. subject 문자열에서 "자바" 문자열이 있으면 "자바 관련 과목이군요!" 출력, 없으면 "자바와 관련 없는 과목이군요" 출력
    if (subject.contains("자바")) {
      System.out.println("자바 관련 과목이군요!");
    } else {
      System.out.println("자바와 관련 없는 과목이군요.");
    }

    //4. subject에서 "자바" 문자열이 포함되어 있는지 검사하고, 해당 문자열이 있으면 "자바 관련 과목이군요!" 출력, 없으면 "자바와 관련 없는 과목이군요" 출력
    String[] substr = subject.split(" ");
    boolean isJavaSubject = false;
    for (String str : substr) {
      if (str.equals("자바")) {
        isJavaSubject = true;
      }
    }
    if (isJavaSubject) {
      System.out.println("자바 관련 과목이군요!");
    } else {
      System.out.println("자바와 관련 없는 과목이군요.");
    }
    
  }
}
