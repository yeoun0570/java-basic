package day12.classtest;

import day11.exec.aa.A;

public class Q19 {

  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(10000);
    System.out.println("현재 잔고는 " + account.getBalance() + "원 입니다.");

    account.setBalance(-100);
    System.out.println("현재 잔고는 " + account.getBalance() + "원 입니다.");

  }

}
