package day18.objectEqualsHashCode;

public class MemberMain {

  public static void main(String[] args) {

    Member m1 = new Member(111, "SSG");
    Member m2 = new Member(112, "SSG");

    //System.out.println(m1 == m2);    //주소값 비교
    System.out.println(m1.equals(m2)); //동명이인
    System.out.println(m1.hashCode() + "\t" + m2.hashCode());

  }

}
