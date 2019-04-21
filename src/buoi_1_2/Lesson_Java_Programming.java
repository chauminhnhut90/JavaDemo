package buoi_1_2;

import java.util.ArrayList;

public class Lesson_Java_Programming {

    public static void main(String[] args) {

        /*
         * Kieu du lieu
         * */

        int a = 10;
        double b = 10.4;
        String c = "Automation";
        boolean d = true;

        /*
         * Operator (+, -, *, /, %)
         * */

        int sum = a + 10;
        inSo(sum);

        int tong = tinhtong(10, 20);
        inSo(tong);

        String e = "Training";
        String text = c + " " + e;
        inChu(text);

        /*
         * Lệnh điều kiện
         * */

        if (a / 2 == 0) {
            inChu("So chan");
        } else {
            inChu("So le");
        }

        switch (a) {
            case 0:
                inChu("a = 0");
                break;

            case 10:
                inChu("a = 10");
                break;

            default:
                inChu("a khac 0 va a khac 10");
                break;
        }

        /*
         * Lệnh lặp
         * */

        // Vong lap in ra gia tri tu 1 den 10
        for (int i = 1; i <= a; i++) {
            inSo(i);
        }

        int count = 1;
        while (count <= a) {
            inSo(count);
            count++;
        }

        count = 1;
        do {
            inSo(count);
            count++;
        } while (count < 10);

        /*
         *  Array (mảng)
         * */

        // Khai bao mang cach 1
        int[] n1 = new int[3];
        n1[0] = 1;
        n1[1] = 3;
        n1[2] = 4;

        // Khai bao mang cach 1
        int[] n2 = new int[]{1, 3, 4};

        // Duyet mang tu dau den cuoi
        for (int i = 0; i < n1.length; i++) {
            inSo(n1[i]);
        }

        // Duyet mang tu cuoi len dau
        for (int i = n2.length - 1; i >= 0; i--) {
            inSo(n2[i]);
        }

        /*
         * ArrayList (Danh sách)
         * */

        // Khai bao danh sach cach 1
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Mua Xuan");
        s1.add("Mua Ha");
        s1.add("Mua Thu");
        s1.add("Mua Dong");

        // Khai bao danh sach cach 2
        ArrayList<String> s2 = new ArrayList<String>() {
            {
                add("Mua Xuan");
                add("Mua Ha");
                add("Mua Thu");
                add("Mua Dong");
            }
        };

        // Duyet danh sach tu dau den cuoi
        for (int i = 0; i < s1.size(); i++) {
            inChu(s1.get(i));
        }

        // Duyet danh sach tu cuoi len dau
        for (int i = s2.size() - 1; i >= 0; i--) {
            inChu(s2.get(i));
        }
    }

    /**
     * Phương thức (hàm) in ra 1 số, và ko nhận giá trị trả về
     */
    private static void inSo(int number) {
        System.out.println(number);
    }

    /**
     * Phương thức (hàm) in ra 1 chuỗi, và ko nhận giá trị trả về
     */
    private static void inChu(String text) {
        System.out.println(text);
    }

    /*
     * Phương thức (hàm) tính tổng của 2 số
     * */
    private static int tinhtong(int sothu1, int sothu2) {
        int tong = sothu1 + sothu2;
        return tong;
    }

}
