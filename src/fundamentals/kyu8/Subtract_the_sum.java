package fundamentals.kyu8;

public class Subtract_the_sum {

    public static String subtractSum (int n) {
        //return fruit name like "apple"
        int sum = 0;
        int old = n;

        do {
            for(; n !=  0;) {
                sum += (n % 10);
                n /= 10;
            }
            n = old - sum;
            old = n;
            sum = 0;
        } while (n > 100);
        n = n%23;
        switch (n) {
            case 1:
                return "kiwi";
            case 2:
                return "pear";
            case 3:
                return "kiwi";
            case 4:
                return "banana";
            case 5:
                return "melon";
            case 6:
                return "banana";
            case 7:
                return "melon";
            case 8:
                return "pineapple";
            case 9:
                return "apple";
            case 10:
                return "pineapple";
            case 11:
                return "cucumber";
            case 12:
                return "pineapple";
            case 13:
                return "cucumber";
            case 14:
                return "orange";
            case 15:
                return "grape";
            case 16:
                return "orange";
            case 17:
                return "grape";
            case 18:
                return "apple";
            case 19:
                return "grape";
            case 20:
                return "cherry";
            case 21:
                return "pear";
            case 22:
                return "cherry";
            case 23:
                return "pear";
        }return "something wrong n= " + n;

    }
    public static void main(String[] args) {
        System.out.println(subtractSum(9266));

        }

}
