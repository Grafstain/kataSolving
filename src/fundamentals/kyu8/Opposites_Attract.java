package fundamentals.kyu8;

public class Opposites_Attract {
    public static boolean isLove(final int flower1, final int flower2) {

        return (flower1%2==0 && flower2%2==0 ||flower1%2!=0 && flower2%2!=0)?false:true;
    }
    public static void main(String[] args) {
        System.out.println(isLove(1, 4));
        System.out.println(isLove(2, 4));
        System.out.println(isLove(1, 1));
        System.out.println(isLove(1, 3));

    }
}
