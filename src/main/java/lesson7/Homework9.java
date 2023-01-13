package lesson7;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {

            int minAge = 18;
            int maxAge = 40;
            int[] firstTeam = new int[25];
            int[] secondTeam = new int[25];
            int firstTeamSum = 0;
            int secondTeamSum = 0;
            double firstTeamAverage;
            double secondTeamAverage;

        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i] = (int) ((Math.random() * (maxAge - minAge + 1)) + minAge);
        }
        for (int firstTeamValue : firstTeam) {
            firstTeamSum += firstTeamValue;
        }
        System.out.println("First team players age: " + Arrays.toString(firstTeam));
        firstTeamAverage = (double) firstTeamSum / firstTeam.length;
            System.out.println("First team average age = " + firstTeamAverage);

        for (int i = 0; i < secondTeam.length; i++) {
            secondTeam[i] = (int) ((Math.random() * (maxAge - minAge + 1)) + minAge);
        }
        for (int secondTeamValue : secondTeam) {
            secondTeamSum += secondTeamValue;
        }
        System.out.println("Second team players age: " + Arrays.toString(secondTeam));
        secondTeamAverage = (double) secondTeamSum / secondTeam.length;
        System.out.println("second team average age = " + secondTeamAverage);
    }
}
