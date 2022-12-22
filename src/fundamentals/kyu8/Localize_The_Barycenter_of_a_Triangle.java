package fundamentals.kyu8;

public class Localize_The_Barycenter_of_a_Triangle {
    /*
    The medians of a triangle are the segments that unit the vertices with the midpoint of their opposite sides. The three medians of a triangle intersect at the same point, called the barycenter or the centroid. Given a triangle, defined by the cartesian coordinates of its vertices we need to localize its barycenter or centroid.

The function bar_triang() or barTriang or bar-triang, receives the coordinates of the three vertices A, B and C  as three different arguments and outputs the coordinates of the barycenter O in an array [xO, yO]

This is how our asked function should work: the result of the coordinates should be expressed up to four decimals, (rounded result).

You know that the coordinates of the barycenter are given by the following formulas.

barTriang([4, 6], [12, 4], [10, 10]) ------> {8.6667, 6.6667}

barTriang([4, 2], [12, 2], [6, 10] ------> {7.3333, 4.6667}
     */

    public static double[] barTriang(double[] x, double[] y, double[] z) {

        double[] coordinates = new double[2];
        for (int i = 0; i < 2; i++) {
            coordinates[i] = (double) ((Math.round((x[i] + y[i] + z[i]) / 3 * 10000))) / 10000;
        }
        return coordinates;
    }

    public static void main(String[] args) {

        double[] result = barTriang(new double[]{4.0, 2.0}, new double[]{12.0, 2.0}, new double[]{6.0, 10.0});
        for (int i = 0; i < 2; i++) {
            System.out.println(result[i] + " ");
        }


    }
}
