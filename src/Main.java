public class Main {

    public static void main(String[] args) {

        /**
         *  Bài tập: Nhập số tuổi của 1 học sinh. In ra học sinh đó học cấp mấy.
         */

        int age = 18;

        // Code dung if ... else
        if (age >= 6 && age <= 11) {
            System.out.println("HOC SINH CAP 1");

        } else if (age <= 15) {
            System.out.println("HOC SINH CAP 3");

        } else if (age <= 18) {
            System.out.println("HOC SINH CAP 3");

        } else if (age > 18) {
            System.out.println("SINH VIEN DAI HOC");
        }

        // Code dung switch
        switch (age) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("HOC SINH CAP 1");
                break;

            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("HOC SINH CAP 2");
                break;

            case 16:
            case 17:
            case 18:
                System.out.println("HOC SINH CAP 3");
                break;

            default:
                System.out.println("SINH VIEN DAI HOC");
                break;
        }

    }
}
