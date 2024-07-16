package day17.database.dbEx.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter //컴파일 시 필드들에 대한 getter 메서드를 전부 생성해준다.
@Setter //컴파일 시 필드들에 대한 setter 메서드를 전부 생성해준다.
@ToString //컴파일 시 필드들에 대한 toString 메서드를 전부 생성해준다.
@EqualsAndHashCode
@RequiredArgsConstructor //디폴트 생성자 자동 생성해준다.
@Data //위의 기능들을 전부 사용 가능
@AllArgsConstructor //모든 필드들에 대한 생성자를 자동 생성해준다.
public class User {
  private String userId;
  private String userName;
  private int userAge;
  private String userEmail;

  // public User() {}   @RequiredArgsConstructor

  /*public User(String id, String name, int age, String email) {   @AllArgsConstructor
    this.userId = id;
    this.userName = name;
    this.userAge = age;
    this.userEmail = email;
  }*/

/*  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getUserAge() {
    return userAge;
  }

  public void setUserAge(int userAge) {
    this.userAge = userAge;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }*/
}
