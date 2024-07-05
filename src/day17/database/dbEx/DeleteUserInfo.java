package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserInfo {

  static Connection con = null;

  public static void main(String[] args) {

    con = ConnFactory.getInstance().open();
    String query = new StringBuilder() //StringBuilder를 통해 길어지는 쿼리문을 편하게 수정한다.
        .append("DELETE FROM users ")
        .append(" WHERE userid = ?").toString(); //마지막에 toString()으로 만들어진 쿼리문을 String으로 저장

    try {
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, "winter");

      int rows = pstmt.executeUpdate(); //rows에 업데이트한 결과를 받는다
      System.out.println("삭제된 행의 수 : " + rows);
      pstmt.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {
      ConnFactory.getInstance().close();
    }

  }

}
