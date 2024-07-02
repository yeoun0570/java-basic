package day15.interfaceEx.sec08;

public class ExtendsExample {

  public static void main(String[] args) {
    InterfaceCImpl imple = new InterfaceCImpl();

    InterfaceA ia = imple;
    ia.methodA();
    //ia.methodB();
    //ia.methodC();
    InterfaceB ib = imple;
    //ib.methodA();
    ib.methodB();
    //ib.methodC();
    InterfaceC ic = imple;
    ic.methodA();
    ic.methodB();
    ic.methodC();

    System.out.println();


  }
}