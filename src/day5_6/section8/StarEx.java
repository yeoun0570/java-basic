package day5_6.section8;

public class StarEx {
    public static void main(String[] args) {

        int c = 0;

        for (int i = 0; i < 5; i++) {

            switch (i) {
                case 1:
                    System.out.print(" ");
                    break;
                case 2:
                    System.out.print("  ");
                    break;
                case 3:
                    System.out.print("   ");
                    break;
                case 4:
                    System.out.print("    ");
                    break;
            } //switch 종료

            for (int j = 9; j > c; j--) {
                System.out.print("*");
            } //j문 종료
            ++c;
            ++c;
            System.out.println();
            
        } // i문 종료
    }
}
