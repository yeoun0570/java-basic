package day18.ObjectEx;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member implements Cloneable{

  private String name;
  private int age;
  //private String address;
  private Address addr;

  @Override
  protected Member clone() throws CloneNotSupportedException {

    try {
      Object cloneAddress = addr.clone();
      Address addr = (Address) cloneAddress;
      Member clonedMember = (Member) super.clone();
      clonedMember.setAddr(addr);
      return clonedMember;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

}
