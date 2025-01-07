public class Nestedif {
        public static void main(String[] args) {
            int a = 30, b = 10, c = 40;
            int big;

            //Nestedif loop syntax
            if (a > b && a > c) {
                big = a;
            } else if (b > c) {
                big = b;
            } else {
                big = c;
            }
            System.out.println(big);
        }
}
