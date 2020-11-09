package syn_junit;

public class SYN_JUNIT {

    public static double myDiv(double a, double b, double x) throws Exception {
        double y;
        if (x <= 9) {
            y = (((a + b) * (a + b)) / (x * x));

        } else {
            y = (x * ((a * a) + (b * b)));

        }
        if (!(Double.isNaN(y)) && (!Double.isInfinite(y))) {
            return y;

        } else {
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(myDiv(9,6,4));
    }

}
