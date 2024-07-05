package day17.database.dbEx.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {

  //ConnectionFactory Mysql server로 부터 Connection을 얻어오는  open()메소드를 작성
  //조건 : 싱글톤 패턴을 적용하여 만들어주세요

  public static final ConnFactory instance = new ConnFactory();
  private static Connection connection = null;
  private static String url = "jdbc:mysql://localhost:3306/ssgdatabase?serverTimezone=UTC";
  private static String id = "root";
  private static String pwd = "1234";

  private ConnFactory() {}

  public static ConnFactory getInstance() { //getInstance()를 사용해서 자신을 사용하라는 뜻
    return instance;
  }


  public Connection open() {
    try {
      connection = DriverManager.getConnection(url, id, pwd);
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return connection;
  }

  public void close() {
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }
}
