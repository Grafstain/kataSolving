package fundamentals.kyu8;

public class Beginner_Reduce_but_Grow {


    public static int grow(int[] x){
        int mult = 1;
        for(int i:x){
            mult *= i;
        }
        return mult;
    }

    public static void main(String[] args) {
        System.out.println(grow(new int[]{1,2,3}));
        System.out.println(grow(new int[]{4,1,1,1,4}));
    }
}
