package day13.emp.vo;

public class SempVO extends Employee{

  private String senior;

  public SempVO() {
  }

  public SempVO(String senior) {
    this.senior = senior;
  }

  public SempVO(String name, int age, String phone, String empDate, String dept, boolean merriage,
      String senior) {
    super(name, age, phone, empDate, dept, merriage);
    this.senior = senior;
  }
}
