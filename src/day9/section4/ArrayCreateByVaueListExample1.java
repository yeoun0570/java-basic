package day9.section4;

public class ArrayCreateByVaueListExample1 {

  public static void main(String[] args) {
    //배열 변수 선언과 배열 생성
    String[] season = {"Spring", "Summer", "Fall", "Winter"};

    //배열의 항목값 읽기
    System.out.println(season[0]);
    System.out.println(season[1]);
    System.out.println(season[2]);
    System.out.println(season[3]);
    System.out.println("=================");
    for (String s : season) {
      System.out.println(s);
    }
    System.out.println("=================");

    //인덱스 1 항목의 값 변경
    season[1] = "여름";
    System.out.println(season[1]);
    System.out.println("=================");

    //정수형 배열 scores 변수 선언하고 배열을 초기화 하여 생성{90,80,75,93,100}
    int[] scores = new int[]{90, 80, 75, 93, 100};

    //총합(total)과 평균(avg)은 정수로 구해서 출력
    int total = 0;
    double avg = 0;

    for (int i = 0; i < scores.length; i++) {
      total += scores[i];   // total = total + i
      avg = (double) total / (i + 1);
    }
    System.out.printf("total : %d\navg : %.1f\n", total, avg);
    System.out.println("=================");
  }
}

