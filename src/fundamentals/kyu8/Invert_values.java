package fundamentals.kyu8;

public class Invert_values {

    public static int[] invert(int[] array) {
        int[] invertArray = new int[array.length];
        for(int i=0; i<array.length;i++){
            invertArray[i] = array[i]*(-1);
        }
        return invertArray;
    }
    public static void main(String[] args) {
        System.out.println(invert(new int[] {-1,-2,-3,-4,-5}));

    }
}
