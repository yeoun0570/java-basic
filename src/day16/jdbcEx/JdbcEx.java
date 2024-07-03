package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx {
  static MemberDB md = new Member();

  public static void main(String[] args) {
    System.out.println("==회원 정보 입력 후 조회===");
    //회원의 정보를 사용자가 입력하여 받는 기능  (static 메소드로)
    //Member 클래스(VO)
    /*md.memberInsert();
    md.memberSearch();
    System.out.println("==회원 정보수정 후 조회===");
    md.memberUpdate();
    md.memberSearch();*/
    System.out.println("==회원 정보삭제 후 조회===");
    md.memberDelete();
    md.memberSearch();

  }

}

