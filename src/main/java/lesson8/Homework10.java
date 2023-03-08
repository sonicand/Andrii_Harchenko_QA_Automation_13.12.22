package lesson8;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0, m = 0;
        System.out.println("Please, enter first value for array creation ");
        if (scanner.hasNextInt()) {
           n = scanner.nextInt();
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please, enter second value for array creation ");
        if (scanner.hasNextInt()) {
            m = scanner.nextInt();
            } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }

        int[][] initial = new int[n][];
        int[][] result = new int[m][];


        for (int i = 0; i < result.length; i++) {
            result[i] = new int[n];
        }

        System.out.println("Initial matrix: ");
        for (int i = 0; i < initial.length; i++) {
            initial[i] = new int[m];
            for (int j = 0; j < initial[i].length; j++) {
                initial[i][j] = (int) (Math.random() * 101);
                System.out.print(initial[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = initial[j][i];
            }
        }

        System.out.println("Result matrix: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

            }
        }
