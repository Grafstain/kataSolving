package fundamentals.kyu8;

public class Third_Angle_of_a_Triangle {

    public static int otherAngle(int angle1, int angle2) {
        return 180-angle1-angle2;
    }
    public static void main(String[] args) {
        System.out.println(otherAngle(45,12));
        System.out.println(otherAngle(50,60));

    }
}
