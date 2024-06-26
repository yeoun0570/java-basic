package day6_7.section1;

import java.util.Scanner;

public class MethodEx1 {

  static Scanner sc = new Scanner(System.in);

  static void getPlayerInfo(int group, int player) {
    System.out.println("그룹 : " + group + " " + "각 그룹의 인원수 : " + player);
  }

  public static void main(String[] args) {
    MethodEx1 mex1 = new MethodEx1();

    int group = 0;
    int player = 0;

    for (int i = 0; i < 3; i++) {
      group = mex1.settingGroup();
      player = mex1.settingPlayer();
    }
  }

  int settingGroup() {
    System.out.print("몇개의 그룹으로 진행할까요? ");
    int n = sc.nextInt();
    return n;
  }

  int settingPlayer() {
    System.out.print("참여자의 인원수를 입력해 주세요 : ");
    int n = sc.nextInt();
    return n;
  }

  //MethodEx 사용자 정의 클래스 안에 들어있는 메서드
  //public을 적어놓았으니 누구나(어떤 클래스든) 이용가능
  //void니까 반환값은 없다
  public void dicePlay(int group, int player) {

    for (int j = 1; j <= group; j++) {
      System.out.printf("%d의 플레이가 시작됩니다.", j);

      for (int i = 1; i <= player; i++) {

        int num = (int) (Math.random() * 6) + 1;

        if (num == 1) {
          System.out.println("1번이 나왔습니다.");
        } else if (num == 2) {
          System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
          System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
          System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
          System.out.println("5번이 나왔습니다.");
        } else {
          System.out.println("6번이 나왔습니다.");
        }
      }//i문 종료
    }
  }
}
