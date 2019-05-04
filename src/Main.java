public class Main {

    public static void main(String[] args) {
        int kqBao10 = bai10(2, 4);
        inSo(kqBao10);

        int kqBao12 = bai10(2, 5);
        inSo(kqBao12);

        int kqBai13 = bai13(2, 6);
        inSo(kqBai13);

        int kqBai14 = bai14(3, 2);
        inSo(kqBai14);
    }

    // Bài 10: Tính T(x, n) = x^n (n >= 0)
    public static int bai10(int x, int n) {
        if (x == 0)
            return 1;

        int tich = 1;
        for (int i = 0; i < n; i++) {
            tich *= x;
        }
        return tich;
    }

    // Bài 12: Tính S(n) = x + x^2 + x^3 + … + x^n
    public static int bai12(int x, int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += bai10(x, i);
        }
        return tong;
    }

    // Bài 13: Tính S(n) = x^2 + x^2.2 + … + x^2n
    public static int bai13(int x, int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += bai10(x, 2 * i);
        }
        return tong;
    }


    // Bài 14: Tính S(n) = x + x^3 + x^5 + … + x^2n + 1
    public static int bai14(int x, int n) {
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            tong += bai10(x, 2 * i + 1);
        }
        return tong;
    }

    public static void inSo(int number) {
        System.out.println(number);
    }
}
