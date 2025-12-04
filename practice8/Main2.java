package practice8;

public class Main2 {
    public static long countS(int a, int b) {
        if (a == 0) return 1L;
        if (a > b + 1) return 0L;
        // Число сочетаний C(b+1, a)
        return combinations(b + 1, a);
    }

    private static long combinations(int n, int k) {
        if (k > n - k) {
            k = n - k; // C(n, k) = C(n, n-k)
        }
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - k + i) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countS(100, 100)); // C(101, 100) = 101
        System.out.println(countS(1, 2)); // C(3, 1) = 3
    }
}