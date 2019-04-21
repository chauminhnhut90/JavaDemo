package buoi_3;

public class Lesson_OOP {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setSochan(4);
        animal.setSoduoi(1);
        animal.setSosung(1);

        System.out.println("Số chân: " +  animal.getSochan());
        System.out.println("Số đuôi: " +  animal.getSoduoi());
        System.out.println("Số sừng: " +  animal.getSosung());

        Animal a = new Cow();
        a.an();

        Animal b = new Tiger();
        b.an();
    }
}
