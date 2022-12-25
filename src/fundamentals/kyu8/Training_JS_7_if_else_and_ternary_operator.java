package fundamentals.kyu8;

public class Training_JS_7_if_else_and_ternary_operator {

    public static int saleHotdogs(final int n){
        // show me the code
        if (n <5){
            return n*100;
        } else if (n<10) {
            return n*95;
        }else{
            return n*90;
        }
    }

    public static void main(String[] args) {
        System.out.println(saleHotdogs(5));
        System.out.println(saleHotdogs(9));
        System.out.println(saleHotdogs(10));
        System.out.println(saleHotdogs(100));

    }
}
