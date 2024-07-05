package day17.database.dbEx.vo;

import day17.database.dbEx.dbconf.ConnFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllUser {

  static Connection con = null;
  static ResultSet rs = null;
  static ArrayList<User> userlist = new ArrayList<>();

  public static void main(String[] args) {
    String query = "SELECT * FROM users ";

    con = ConnFactory.getInstance().open();

    try {
      PreparedStatement pstmt = con.prepareStatement(query);

      rs = pstmt.executeQuery();

      while(rs.next()){
        User user = new User();

        user.setUserId(rs.getString("userid"));
        user.setUserName(rs.getString("username"));
        user.setUserAge(rs.getInt("userage"));
        user.setUserEmail(rs.getString("useremail"));
        userlist.add(user); //rs.next()로 한 행씩 커서로 옮기면서 그 값을 ArrayList<>배열인 userlist에 저장
        System.out.println(user.toString());

        System.out.println("회원 아이디 : " + user.getUserId());
      }
      for(User user : userlist) {
        System.out.println(user.getUserId()+ " " + user.getUserName());
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
