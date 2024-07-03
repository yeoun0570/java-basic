package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Member extends MemberDB {
  static Scanner sc = new Scanner(System.in);

  @Override
  void memberDelete() {
    String query = "DELETE FROM member where id = ? ";

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);
      System.out.print("삭제하고싶은 회원의 아이디를 입력하세요 : ");
      int id = sc.nextInt();
      pstmt.setInt(1, id);
      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }

      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  void memberUpdate() {
    String query = "UPDATE member SET job = ? where id = ? ";

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);

      System.out.print("바꾸고 싶은 직업을 입력해주세요 : ");
      pstmt.setString(1, sc.next());
      System.out.print("회원의 아이디를 입력해주세요 : ");
      pstmt.setInt(2, sc.nextInt());

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 완전 잘 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패하였습니다.");
      }
      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void memberInsert() {
    String query = "INSERT INTO member VALUES(?,?,?)";

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      pstmt = con.prepareStatement(query);
      pstmt.setInt(1, 4);
      System.out.print("회원의 이름을 입력해 주세요 : ");
      String name = sc.next();
      pstmt.setString(2, name);
      sc.nextLine();
      System.out.print("회원의 직업을 입력해 주세요 : ");
      String job = sc.next();
      pstmt.setString(3, job);

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패하였습니다.");
      }
      pstmt.close();
      con.close();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void memberSearch() {
    String query = "SELECT * FROM member";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, password);
      System.out.println(con);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("id : %d name : %6s  job : %s\n", id, name, job);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}

