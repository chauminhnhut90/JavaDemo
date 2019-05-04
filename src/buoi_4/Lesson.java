package buoi_4;

@SuppressWarnings("all")
public class Lesson {
    // 1. Search
    // 2. Listed
    // 3. Sum
    // 4. Count
    // 5. Sort

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 2, 5, 3, 2};

        daoMang(array);
        inMang(array);
    }

    private static void daoMang(int[] array) {
        int full_lenght = array.length;
        int half_lenght = array.length / 2;

        for (int i = 0; i < half_lenght; i++) {
            int j = full_lenght - 1 - i;

            int tam = array[i];
            array[i] = array[j];
            array[j] = tam;
        }
    }

    private static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            inSo(array[i]);
        }
    }

    private static void lietKeLe(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                inSo(array[i]);
            }
        }
    }

    private static void lietKeChan(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                inSo(array[i]);
            }
        }
    }

    private static int tinhtong(int[] array) {
        int tong = 0;
        for (int i = 0; i < array.length; i++) {
            tong += array[i];
        }
        return tong;
    }

    private static int dem(int[] array, int x) {
        int count = 0;
        return count;
    }

    private static void sortTangDan(int[] array) {
        int lenght = array.length;
        for (int i = 0; i < lenght - 1; i++) {
            for (int j = i + 1; j < lenght; j++) {
                if (array[i] > array[j]) {
                    int tam = array[i];
                    array[i] = array[j];
                    array[j] = tam;
                }
            }
        }
    }

//    private static void hoanVi(int[] array, int vitri1, int vitri2) {
//        int tam = array[vitri1];
//        array[vitri1] = array[vitri2];
//        array[vitri2] = tam;
//    }

    private static void inSo(int number) {
        System.out.println(number);
    }


}
