public class Task10 {
        public static int gcd(int a, int b){
            //if b is zero then GCD is a
            if (b == 0) {
                return a;
            }
            //compute GCD of b and the remainder of a divided by b
            else {
                return gcd(b, a % b);
            }
        }
}
