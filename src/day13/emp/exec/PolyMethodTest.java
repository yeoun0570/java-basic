package day13.emp.exec;

import day11.exec.aa.A;
import day13.emp.vo.Animal;
import day13.emp.vo.Cat;
import day13.emp.vo.Dog;
import javax.print.attribute.standard.MediaSize.NA;

public class PolyMethodTest {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    //display(cat);
    Animal[] animals = new Animal[2];
    animals[0] = dog;
    animals[1] = cat;
    display1(animals);
  }

  public static void display(Animal animal) { //다형성 인수 : 하나의 타입으로 여러가지 타입을 받을 수 있다.
    animal.eat();
    if (animal instanceof Cat) { //animal이 Cat인지 검사 (instanceof : 객체의 타입을 검사할 때)
      ((Cat) animal).night(); //animal이 Cat이라고 하면 night()를 실행한다.
    }
  }

  public static void display1(Animal[] animal) {
    for (Animal ani : animal) {
      ani.eat();
      if (ani instanceof Cat) {
        ((Cat) ani).night();
      }
    }
  }
}

