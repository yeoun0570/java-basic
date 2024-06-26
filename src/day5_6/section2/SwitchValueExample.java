package day5_6.section2;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        //Java 11 이전 문법


        //Java 12부터 가능
        //타입변수 score2에 grade값에 따라
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result; //Java13부터 지원, yield를 이용해서 result값을 score2에 넘김
            }
            default -> 60;
        };
        System.out.println("score2의 값: " + score2);


    }
}