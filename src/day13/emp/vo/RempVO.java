package day13.emp.vo;

public class RempVO extends Employee {

  public RempVO(){
    super();
  }

  public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
    super(name, age, phone, empDate, dept, marriage);
  }

  public RempVO(String name, int age, String phone) {
    super(name, age, phone);
  }

}
