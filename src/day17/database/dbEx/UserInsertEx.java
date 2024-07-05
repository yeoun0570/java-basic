package day17.database.dbEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEx {

  public static void main(String[] args) {
    Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/ssgdatabase?serverTimezone=UTC";
    String id = "root";
    String pwd = "1234";

    String query = "INSERT INTO users(userid, username, userage, useremail) " + "VALUES(?,?,?,?)";

    try {
      connection = DriverManager.getConnection(url, id, pwd);
      //PreparedStatement 객체 생성하여 쿼리문 넣기
      PreparedStatement pstmt = connection.prepareStatement(query);

      //PreparedStatement 객체 파라미터(=?)에 순서와 타입 확인하여 데이터 할당하기
      pstmt.setString(1, "winter"); // 1 : query의 첫번째 ?를 의미
      pstmt.setString(2, "윤여운");
      pstmt.setInt(3, 26);
      pstmt.setString(4, "winter0712@gmail.com");

      //SQL문 실행
      pstmt.executeUpdate();
      pstmt.close(); // pstmt는 다쓰면 바로 close()해주는게 좋다
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {
      if(connection != null) {
        try {
          connection.close();
          System.out.println("bye!");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }
    }
  }

}
