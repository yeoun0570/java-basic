package day13.emp.exec;

import day13.emp.vo.RempVO;

public class EmployeeInitTest {

  public static void main(String[] args) {
    RempVO vo1 = new RempVO();
    RempVO vo = new RempVO("홍길동", 30, "010-1111-1111", "2024/06/28", "홍보부", true);
    RempVO vo2 = new RempVO("홍길순",20,"010-1111-2222");
    System.out.println(vo2.toString());
  }
}
