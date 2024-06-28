package day13.emp.vo;

public class MempVO extends Employee{

  private String mdept;

  public MempVO(String mdept) {
    this.mdept = mdept;
  }

  public MempVO() {
  }

  public MempVO(String name, int age, String phone, String empDate, String dept, boolean merriage,
      String mdept) {
    super(name, age, phone, empDate, dept, merriage);
    this.mdept = mdept;
  }
}
