package day18.wrapperEx;

public class WrapEx01 {

  public static void main(String[] args) {
    //100값을 객체로 생성해 주세요 --> 박싱(Boxing)
    Integer value = 100;  //자동박싱 java1.5부터 제공

    int v = value.intValue(); //언박싱
    int v1 = value; //자동언박싱

    v = v + 100;
    value = v; //박싱(재포장)
    System.out.println(value);

    Boolean b1 = true; //박싱
    boolean b2 = b1.booleanValue(); //언박싱

    Integer num1 = 10;
    Integer num2 = 20;
    Integer result1 = num1 + num2;
    System.out.println(result1);
    
    //객체 값 비교   equals()로 비교해야 한다.
    System.out.println(num1.equals(num2));
    System.out.println(num1 < num2);
    System.out.println(num1 + num2);

    //String 문자를 포장객체가 언박싱 할 때
    String str1 = "10";
    String str2 = "10.5";
    int value2 = Integer.parseInt(str1);
    byte value4 = Byte.parseByte(str1);
    short value5 = Short.parseShort(str1);
    long value6 = Long.parseLong(str1);
    float value7 = Float.parseFloat(str2);
    double value3 = Double.parseDouble(str2);

    //

  }

}
