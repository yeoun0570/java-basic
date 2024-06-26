package day10.section1;

public class UserMain {

  public static void main(String[] args) {
    User me = new User("윤여운", "991007-1");
    System.out.println("국적 : " + me.nation + " " + me.name + " " + me.ssn);
  }

}
