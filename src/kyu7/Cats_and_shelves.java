package kyu7;

public class Cats_and_shelves {
    public static int solution(int start, int finish) {
        return (finish - start)/3 + (finish - start) % 3;
    }
    public static void main(String[] args) {
        System.out.println(solution(1, 5));//2
        System.out.println(solution(931, 960));//11
        System.out.println(solution(205, 999));//266
        System.out.println(solution(200, 932));//244

    }
}
