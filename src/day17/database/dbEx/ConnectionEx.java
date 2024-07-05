package day17.database.dbEx;

import java.sql.Connection;
import java.sql.*;

public class ConnectionEx {
  private static Connection connection = null;
  private static String url = "jdbc:mysql://localhost:3306/ssgdatabase?serverTimezone=UTC";
  private static String id = "root";
  private static String pwd = "1234";

  public static void main(String[] args) {

    try {
      //JDBC 드라이버 등록
      Class.forName("com.mysql.cj.jdbc.Driver"); //생략가능

      //연결하기
      connection = DriverManager.getConnection(url, id, pwd);
      System.out.println("connection 객체값 = " + connection);
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    } finally {
      if(connection != null){
        //연결끊기
        try {
          connection.close(); //close()는 연결을 끊을 때 문제가 있을 수 있으니 예외처리가 반드시 필요한 메서드이다.
          System.out.println("서버와의 연결이 끊겼습니다.");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }
    }

  }

}
