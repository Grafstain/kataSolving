package fundamentals.kyu8;

public class Cat_years_Dog_years {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        switch (humanYears) {
            case 1:
                return new int[]{1,15,15};
            case 2:
                return new int[]{2,24,24};
            case 3:
                return new int[]{3,28,29};
            default:
                return new int[]{humanYears,(humanYears-3)*4+28,(humanYears-3)*5+29};
        }
    }

    public static void main(String[] args) {
        System.out.print(humanYearsCatYearsDogYears(2));
        }
}
