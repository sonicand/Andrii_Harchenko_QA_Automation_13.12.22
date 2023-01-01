package lesson4;

public class Homework4 {
    public static void main(String[] args) {

        int sideA = 10;
        int sideB = 20;
        int sideC = 30;
        int volume = sideA * sideB * sideC;
        int sideLength = (sideA + sideB + sideC) *4;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Суммарна довжина всіх сторін = " + sideLength);
    }
}
