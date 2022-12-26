package fundamentals.kyu8;

public class Will_you_make_it {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump<=mpg*fuelLeft?true:false;
    }
    public static void main(String[] args) {
        System.out.println(zeroFuel(50, 25, 2));
        System.out.println(zeroFuel(100, 50, 1));
    }
}
