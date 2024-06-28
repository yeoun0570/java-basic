package day13.emp.vo;

public class DempVO extends Employee{

  private String period;

  public DempVO(String period) {
    this.period = period;
  }

  public DempVO() {
  }

  public DempVO(String name, int age, String phone, String empDate, String dept, boolean merriage,
      String period) {
    super(name, age, phone, empDate, dept, merriage);
    this.period = period;
  }
}
