package fundamentals.kyu8;

public class Keep_up_the_hoop {
    public static String hoopCount(int n){
        return n<10?"Keep at it until you get it":"Great, now move on to tricks";
    }
    public static void main(String[] args) {
        System.out.println(hoopCount(14));

    }
}
