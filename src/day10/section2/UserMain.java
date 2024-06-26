package day10.section2;

public class UserMain {

  public static void main(String[] args) {
    User me = new User("윤여운", "991007");

    // System.out.println("국적 : " + me.nation + " " + me.name + " " + me.ssn);
    // me 객체의 이름을 "홍길동"으로 변경하고 ssn을 "111111" 변경 : setter 변경
    String oldname = me.getName();
    String oldssn = me.getSsn();

    me.setName("홍길동");
    me.setSsn("111111");

    System.out.println("변경 전 : " + oldname + " " + oldssn);
    System.out.println("현재 값 : " + me.getName() + " " + me.getSsn());


  }

}
