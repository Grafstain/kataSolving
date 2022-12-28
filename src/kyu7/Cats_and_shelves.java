package kyu7;

public class Cats_and_shelves {
    public static int solution(int start, int finish) {
        if((finish-start)%3==1){return (finish-start)/3+1;}
        if((finish-start)%3==0){return (finish-start)/3;}
        if((finish-start)%3==2){return (finish-start)/3+2;}
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(solution(1, 5));//2
        System.out.println(solution(931, 960));//11
        System.out.println(solution(205, 999));//266
        System.out.println(solution(200, 932));//244

    }
}
