package fundamentals.kyu8;

public class Quarter_of_the_year {

    public static int quarterOf(int month) {
        // Your code here
        if ((double)(month)/3<=1){
            return 1;
        }else
        if ((double)(month)/3<=2){
            return 2;
        }else
        if ((double)(month)/3<=3){
            return 3;
        }else{
            return 4;
        }

    }
    public static void main(String[] args) {
        System.out.println(quarterOf(3));
        System.out.println(quarterOf(6));
        System.out.println(quarterOf(9));
        System.out.println(quarterOf(10));
    }
}

