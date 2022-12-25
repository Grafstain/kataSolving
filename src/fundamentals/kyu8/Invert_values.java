package fundamentals.kyu8;

public class Invert_values {

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] newArray = invert(new int[]{-1, -2, -3, -4, -5});
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }
}
