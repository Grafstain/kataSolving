package fundamentals.kyu8;

public class Difference_of_Volumes_of_Cuboids {


    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        //your code here !!
        int v1=1,v2=1;
        for(int i:firstCuboid){
            v1 *= i;
        }
        for(int i:secondCuboid){
            v2 *= i;
        }
        return v1>=v2?v1-v2:v2-v1;
    }
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        System.out.println(findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
    }
}
