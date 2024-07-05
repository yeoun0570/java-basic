package day17.exception;

public class ExceptionEx01 {

  public static void main(String[] args) {
    printLengthString("JavaDATABASE_PROGRAMMING");
    printLengthString(null);
  }

  public static void printLengthString(String data) {

    int result = 0;

    try {
      result = data.length();
      System.out.println("문자 수 = " + result);

      Class.forName("Java.lang.String"); //forName은 반드시 예외처리가 필요하다
      System.out.println("String 클래스가 존재합니다.");

    } catch (NullPointerException e) {
      System.err.println(e.getMessage());
      System.out.println(e.toString());
      e.printStackTrace(); //예외 메시지까지 출력

      System.out.println("null 예외 처리 완료!");
    } catch (ClassNotFoundException e) { //forName예외처리
      e.printStackTrace();
    }finally {
      System.out.println("마무리 해!");
    }

  }

}
