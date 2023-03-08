package lesson6;

public class Homework8 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            if (i / 10 == 4 || i % 10 == 4 || i / 10 == 9 || i % 10 == 9 || i / 14 == 10) {
                continue;
            }
            System.out.println(i);
            counter++;
        }
        System.out.println("Кількість шатлів = " + counter);

    }
}
