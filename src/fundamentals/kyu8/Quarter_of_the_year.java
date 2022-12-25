package fundamentals.kyu8;

public class Quarter_of_the_year {

    public static int quarterOf(int month) {
        return (month+2)/3;
    }
    public static void main(String[] args) {
        System.out.println(quarterOf(3));
        System.out.println(quarterOf(6));
        System.out.println(quarterOf(9));
        System.out.println(quarterOf(10));
    }
}

