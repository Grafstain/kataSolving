package fundamentals.kyu8;

public class Pythagorean_Triple {

    public static int pythagoreanTriple(int[] triple){
        return triple[0]*triple[0]+triple[1]*triple[1]==triple[2]*triple[2]?1:0;

    }

    public static void main(String[] args) {
        int[] p1={3,4,5};
        int[] p2={3,5,7};
        System.out.println(pythagoreanTriple(p1));
        System.out.println(pythagoreanTriple(p2));


    }
}
