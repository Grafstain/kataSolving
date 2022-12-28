package kyu7;

public class Perpendicular_lines {
    public static int maxBisectors(int n) {
        int result =0;
        int angles =0;
        for (int i=0;i<=n;i++) {
            if (i < 2) {
                result = 0;
                continue;
            }
            if (i % 2 == 0) {
                result += angles+1;
                angles += 1;
            }else {
                result += angles;

            }
        }return result;

    }
    public static void main(String[] args) {
//        System.out.println(maxBisectors(1));
//        System.out.println(maxBisectors(5));
//        System.out.println(maxBisectors(6));
        System.out.println(maxBisectors(51));

    }
}
