package day9.section5;

import java.util.Scanner;

public class MultidimensionalArrayByNewExample {

  public static void main(String[] args) {
    /*// 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
    int[][] engScores = new int[2][3];

    // 배열 항목 초기값 출력 (for 이용)
    for (int i = 0; i < engScores.length; i++) {
      for (int j =0; j < engScores[i].length; j++){
        System.out.println("engScores[" + i + "]" + "[" + j + "]");
      }
    }//for문 종료
    System.out.println("=====================");
    // engScores 배열에 점수를 입력받아 항목값을 변경한 후 변경값을 출력하세요
    Scanner sc = new Scanner(System.in);
    int total = 0;
    double avg = 0;
    int studentNum = 0;

    for (int i =0; i < engScores.length; i++) {
      studentNum += engScores[i].length;
      for(int j = 0; j < engScores[i].length; j++) {
        System.out.print("한 학생의 영어점수 입력 : ");
        engScores[i][j] = sc.nextInt();
        total += engScores[i][j];
        avg = (double) total / studentNum;
      }
    }
    // 전체 학생의 영어 점수 총합과 평균을 구하기
    System.out.printf("점수 총합 : %d\n평균 : %.1f\n",total,avg);
    System.out.println("=====================");*/

    // 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
    Scanner sc = new Scanner(System.in);
    int[][] mathScores = new int[3][]; // []안을 비어놓으면 추후에 내가 지정해줄 수 있음

    int stuNum = 0; //각 반의 학생 수를 정한다

    // 1반 : 5명 / 2반 : 3명 / 3반 : 10명
    // 각 반의 학생수를 입력받아 초기값을 출력하세요
    mathScores[0] = new int[5];
    mathScores[1] = new int[3];
    mathScores[2] = new int[10];

    for (int i = 0; i < mathScores.length; i++) {
      mathScores[i] = new int[sc.nextInt()];
    }
    System.out.println("=====================");



    System.out.println();
    // 배열 항목 값 변경

    // 전체 학생의 영어 평균 구하기

  }
}
