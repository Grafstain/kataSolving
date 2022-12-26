package fundamentals.kyu8;

public class String_Templates_Bug_Fixing5 {

    public static String buildString(String... args) {
        String result = "I like ";
        if (args.length == 0) {
            return result;
        }
        for (int i = 0; i <= args.length - 1; i++) {

            result += args[i] + ", ";
            if ((i == args.length - 1)) {
                result = result.replaceAll(args[i] + ", ", args[i] + "!");
            }
            if (args[i].equals(" ")||args[i].isEmpty()){
                result = "I like ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(buildString("Cheese", "Milk", "Chocolate"));
        System.out.println(buildString("Cheese", "Milk"));
        System.out.println(buildString(" "));
        System.out.println(buildString(""));
        System.out.println(buildString());
    }
}
