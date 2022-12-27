package fundamentals.kyu8;

public class Find_the_Slope {
    public static String slope(int[] points) {
        int m = 0;
//        m = (points[3]-points[1])/(points[2]-points[0]);
        return (points[2]-points[0])==0?"undefined":String.valueOf((points[3]-points[1])/(points[2]-points[0]));
    }
    public static void main(String[] args) {
        System.out.println(slope(new int[]{-7,2,-7,4}));//x1,y1,x2,y2
        System.out.println(slope(new int[]{10,50,30,150}));

    }
}
