package day12.classtest;

public class Q18 {

  public static void main(String[] args) {
    ShopService obj1 = ShopService.getInstance();
    ShopService obj2 = ShopService.getInstance();

    if(obj1 == obj2){
      System.out.println("동일 매장입니다.");
    } else {
      System.out.println("서로 다른 매장입니다.");
    }
  }

}

/*싱글톤 패턴(공식)
* 특정 클래스의 인스턴스를 1개만 생성되는 것을 보장하는 디자인 패턴
* 인스턴스를 새로 생성하지 않고 최초 호출시에 만들어 두었던 인스턴스를 재활용하는 패턴
* <장점>
* - 메모리 낭비를 방지 가능하다
* 최초 한번 new로 객체를 생성하고 해당 객체를 이후에 사용하도록
* 공유(static)하여 메모리 낭비 문제를 방지하는 효과가 있다.
* 
* - 접근제어
* 최초 만들어진 객체를 공유해 주지 않으면 
* 서비스를 사용할 수 없도록 제한할 수 있다.
* 
* <단점>
* - 의존성이 높아진다.
* 강한 결합 :
* 만약 서비스의 수정이나 확장 요청시
* 싱글톤으로 생성된 인스턴스를 참조하는 모든 클래스들을 수정해야한다.
*
* - private 생성자때문에 상속이 어렵다.
* 상속을 통한 자식 클래스를 만들 수 없다. ==> 다형성 적용이 어렵다.
*
* - 테스트가 어렵다.
* 테스트마다 공유하고 있는 인스턴스 상태를 매번 초기화해야 하기 때문이다.
* 초기화하지 않으면 static(전역)에서 상태를 공유중이여서
* 테스트가 정상적으로 수행되지 못할 가능성이 높다. 그래서 안티패턴이라고도 한다.
* ==> 개선하기 위해 스프링의 도움을 받아 보완하고, 싱글톤 패턴의 장점만 적용하여 사용하도록 설계한다.
*
* */
