package fundamentals.kyu8;

public class String_Templates_Bug_Fixing5 {

        public static String buildString(String... args) {
            return "I like " + String.join(", ", args) + "!";
        }

    public static void main(String[] args) {
        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
        System.out.println(buildString("Cheese", "Milk"));
        System.out.println(buildString(" "));
        System.out.println(buildString(""));
        System.out.println(buildString());
    }
}
