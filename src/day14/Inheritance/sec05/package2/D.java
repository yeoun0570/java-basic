package day14.Inheritance.sec05.package2;

import day14.Inheritance.sec05.package1.A;

public class D extends A {

  //생성자 선언
  public D() {
    //A() 생성자 호출
    super();        //o
  }

  //메소드 선언
  public void method1() {
    //A 필드값 변경
    this.field = "value";  //o
    //A 메소드 호출
    this.method();      //o
    System.out.println(this.field);
  }

  //메소드 선언
  public void method2() {
//    A a = new A();		//new를 못하는 이유 --> protected로 막으면 부모를 객체로 생성하는 것을 막는다 + 만약 default로 해도 안될 것이다. 왜냐하면 default는 다른 패키지에서는 안되기 때문
//    a.field = "value"; 	//x
//    a.method(); 			//x
  }

  public static void main(String[] args) {
    D d = new D();
    d.method1();  //A클래스의 method()가 protected이기 때문에 this도 사용 가능
  }
}
