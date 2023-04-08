public class Task9 {
    public static int findBinomialCoefficient(int n, int k) {
        //C(n,0) = C(n, n) = 1
        if (k == 0 || k == n) {
            return 1;
        }
        //add together C(n-1, k-1) and C(n-1, k)
        else {
            return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
        }
    }
}
