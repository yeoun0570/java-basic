package day18.objectEqualsHashCode;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

  private int memberCode;
  String name;

  @Override
  public boolean equals(Object o) {
    if(o instanceof Member m) {
      if(this.memberCode == m.getMemberCode() && name.equals(m.getName())) {
        return true;
      }
    }
    return false;

  }

}
