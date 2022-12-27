package fundamentals.kyu8;

public class Calculate_BMI {

    public static String bmi(double weight, double height) {
        double result = weight / (height * height);
        if (result <= 18) {
            return "Underweight";
        } else if (result<=25) {
            return  "Normal";
        } else if (result<=30) {
            return "Overweight";
        }else{
            return "Obese";
        }
    }
    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));

    }
}
