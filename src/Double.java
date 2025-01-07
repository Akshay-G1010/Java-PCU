public class Double {

        static double big(double a, double b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }

        public static void main(String [] args) {
            double x = big(20, 40);
            double y = big(10, 20);
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
}
