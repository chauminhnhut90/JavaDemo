package buoi_3;

public class HW_OOP {

    public static void main(String[] args) {
        // 1. Ap dụng baitap 10, làm các bài 12, 13, 14
        /**
         * Bài 12: Tính S(n) = x + x^2 + x^3 + … + x^n
         * Bài 13: Tính S(n) = x^2 + x^4 + … + x^2n
         * Bài 14: Tính S(n) = x + x^3 + x^5 + … + x^2n + 1
         * */

        // 2. Viết chương trình tính chu vi đa giác n cạnh bất ký, với điều kiện n > 2. Biết rằng chu vi được tính bẳng động dài tồng số cạnh
    }

    private static void bai_10(int x, int n) {
        // Bài 10: Tính T(x, n) = x^n
        if (n == 0) {
            System.out.println(1);
        } else {
            int tich = 1;
            for (int i = 1; i <= n; i++) {
                tich = tich * x;
            }
            System.out.println(tich);
        }
    }
}
