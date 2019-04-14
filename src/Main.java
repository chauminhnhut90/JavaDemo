import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        baitap1();
        baitap2();

        bai_1(10);
        bai_2(10);
        bai_3(10);
    }

    private static void baitap1() {

        /*
         * Tạo danh sách có 10 phần tử số nguyên (int) có giá trị từ 1 tới 10. Sau đó in ra
         *
         * Ghi chú: sử dụng cả Array và ArayList
         * */

        // Sử dụng Array
        int[] a = new int[10];
        for (int i = 0; i <= 9; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Sử dụng ArrayList
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            b.add(i);
        }

        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
        }
    }

    private static void baitap2() {
        
        /**
         * Bài tập 2:
         *
         * Tạo 1 mảng chứa tất cả các mùa trong năm. Sau đó in ra mảng giá trị
         *
         * Sử dụng Array or ArrayList
         * */

        // Sử dụng Array
        String[] a = new String[]{"XUAN", "HA", "THU", "DONG"};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Sử dụng ArrayList
        ArrayList<String> b = new ArrayList<>();
        b.add("XUAN");
        b.add("HA");
        b.add("THU");
        b.add("DONG");
        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
        }
    }


    private static void bai_1(int n) {
        // Tính S(n) = 1+2+3....+n;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("KQ bai_1: " + sum);
    }

    private static void bai_2(int n) {
        // Tính S(n) = 1*2*3....*n;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("KQ bai_2: " + sum);
    }

    private static void bai_3(int n) {
        // Tính S(n) = 1^2 + 2^2 + … + n^2
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i);
        }
        System.out.println("KQ bai_3: " + sum);
    }
}
