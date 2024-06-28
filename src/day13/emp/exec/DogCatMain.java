package day13.emp.exec;

import day13.emp.vo.Animal;
import day13.emp.vo.Cat;
import day13.emp.vo.Dog;

public class DogCatMain {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();

    Cat cat = new Cat();
    cat.eat();

    Animal x = new Cat();
    x.eat();
    Cat cat1 = (Cat) x;
    cat1.night();

    Animal cat2 = new Cat();
    cat2.eat();
    cat2 = (Cat) cat2;
    ((Cat) cat2).night();

    x = new Dog();
    x.eat();

  }

}
