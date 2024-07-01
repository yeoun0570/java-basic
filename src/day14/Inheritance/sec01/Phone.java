package day14.Inheritance.sec01;

import java.util.Collections;

public class Phone {

  //필드 선언
  protected String model;
  protected String color;

  protected Phone() {

  }

  protected Phone(String model, String color){
    this.model = model;
    this.color = color;
  }


  //메소드 선언
  protected void bell() {
    System.out.println("벨이 울립니다.");
  }

  protected void sendVoice(String message) {
    System.out.println("자기: " + message);
  }

  protected void receiveVoice(String message) {
    System.out.println("상대방: " + message);
  }

  protected void hangUp() {
    System.out.println("전화를 끊습니다.");
  }
}