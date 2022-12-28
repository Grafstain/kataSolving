package kyu7;

public class Perpendicular_lines {
    public static int maxBisectors(int n) {
        return (int) (.25 * n * n);

    }
    public static void main(String[] args) {
        System.out.println(maxBisectors(1));
        System.out.println(maxBisectors(5));
        System.out.println(maxBisectors(6));
        System.out.println(maxBisectors(51));

    }
}
