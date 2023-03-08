package lesson6;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 11);
        System.out.println("Завдання: Вгадати задане комп'ютером число від 0 до 10 за три спроби");
        System.out.println("Перша спроба");
        Scanner newScanner = new Scanner(System.in);
        int number = newScanner.nextInt();
        if (number > random || number < random) {
            for (int counter = 2; counter > 0; --counter) {
                if (number > random) {
                    System.out.println("Ваше число більше за те, що загадав комп'ютер. Залишилось спроб: " + counter );
                    int secondTry;
                    secondTry = newScanner.nextInt();
                    number = secondTry;
                }
                else if (number < random) {
                    System.out.println("Ваше число меньше за те, що загадав комп'ютер. Залишилось спроб " + counter);
                    int thirdTry;
                    thirdTry = newScanner.nextInt();
                    number = thirdTry;
                }
            }
            if (number == random) {
                System.out.println("Ви вгадали");
            }
        }
        if (number > random || number < random) {
            System.out.println("Ви програли!");
        }
    }
    }