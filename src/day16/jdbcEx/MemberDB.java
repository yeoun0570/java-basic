package day16.jdbcEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class MemberDB {

  String url = "jdbc:mysql://localhost:3306/employees?characterEncoding=UTF-8&serverTimezone=UTC";
  String userName = "root";
  String password = "1234";

  Connection con = null;
  PreparedStatement pstmt = null;
  Statement stmt = null;
  ResultSet rs = null;
  int result = 0;

  abstract void memberDelete();
  abstract void memberUpdate();
  abstract void memberInsert();
  abstract void memberSearch();

}
