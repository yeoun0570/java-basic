package day17.database.dbEx;

import day17.database.dbEx.dbconf.ConnFactory;
import day17.database.dbEx.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneUser {

  public static void main(String[] args) {
  ResultSet rs = null;

    String query = "SELECT userid, username, userage, useremail " +
                    "From users " +
                    " WHERE userid = ?";

    Connection con = ConnFactory.getInstance().open();

    try {
      PreparedStatement pstmt = con.prepareStatement(query);

      pstmt.setString(1,"winter");

      rs = pstmt.executeQuery();

      if(rs.next()){
        User user = new User();

        user.setUserId(rs.getString("userid"));
        user.setUserName(rs.getString("username"));
        user.setUserAge(rs.getInt("userage"));
        user.setUserEmail(rs.getString("useremail"));
        System.out.println(user.toString());
      } else {
        System.out.println("해당 회원은 존재하지 않습니다.");
      }
      
      rs.close(); // 다 썼으면 바로 끊자
      pstmt.close();

    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {
      ConnFactory.getInstance().close();
    }


  }

}
