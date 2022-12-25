package fundamentals.kyu8;

public class Find_Maximum_and_Minimum_Values_of_a_List {

    public static int min(int[] list) {
        int minValue = list[0];
        for(int i=1;i<list.length;i++){
            if(list[i] < minValue){
                minValue = list[i];
            }
        }
        return minValue;
    }

    public static int max(int[] list) {
        int maxValue = list[0];
        for(int i=1;i<list.length;i++){
            if(list[i] > maxValue){
                maxValue = list[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(max(new int[]{4,6,2,1,9,63,-134,566}));

    }
}
