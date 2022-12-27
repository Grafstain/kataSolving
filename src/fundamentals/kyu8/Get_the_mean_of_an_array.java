package fundamentals.kyu8;

import java.util.Arrays;

public class Get_the_mean_of_an_array {

    public static int getAverage(int[] marks){
        return Arrays.stream(marks).sum()/marks.length;
    }

    public static void main(String[] args) {
        System.out.println(getAverage(new int[] {2,2,2,2}));//x1,y1,x2,y2
        System.out.println(getAverage(new int[] {1,2,3,4,5}));

    }
}
