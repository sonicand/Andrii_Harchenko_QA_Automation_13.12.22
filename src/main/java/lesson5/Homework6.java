package lesson5;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first team name");
        String firstTeamName = scanner.nextLine();
        System.out.println("First team name is " + firstTeamName);
        System.out.println("Please enter frag amount for first player of the " + firstTeamName + " Team");
        int t1P1FragCount = 0;
        int t1P2FragCount = 0;
        int t1P3FragCount = 0;
        int t1P4FragCount = 0;
        int t1P5FragCount = 0;
        if (scanner.hasNextInt()) {
            t1P1FragCount = scanner.nextInt();
            System.out.println(firstTeamName + " Team first player frag count is " + t1P1FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for second player of the " + firstTeamName + " Team");
        if (scanner.hasNextInt()) {
            t1P2FragCount = scanner.nextInt();
            System.out.println(firstTeamName + " Team second player frag count is " + t1P2FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for second player of the " + firstTeamName + " Team");
        if (scanner.hasNextInt()) {
            t1P3FragCount = scanner.nextInt();
            System.out.println(firstTeamName + " Team third player frag count is " + t1P3FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for fourth player of the " + firstTeamName + " Team");
        if (scanner.hasNextInt()) {
            t1P4FragCount = scanner.nextInt();
            System.out.println(firstTeamName + " Team fourth player frag count is " + t1P4FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for fifth player of the " + firstTeamName + " Team");
        if (scanner.hasNextInt()) {
            t1P5FragCount = scanner.nextInt();
            System.out.println(firstTeamName + " Team fifth player frag count is " + t1P5FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        scanner.nextLine();
        System.out.println("Please enter second team name");
        String secondTeamName = scanner.nextLine();
        System.out.println("Second team name is " + secondTeamName);
        int t2P1FragCount = 0;
        int t2P2FragCount = 0;
        int t2P3FragCount = 0;
        int t2P4FragCount = 0;
        int t2P5FragCount = 0;
        System.out.println("Please enter frag amount for first player of the " + secondTeamName + " Team");
        if (scanner.hasNextInt()) {
            t2P1FragCount = scanner.nextInt();
            System.out.println(secondTeamName + " Team first player frag count is " + t2P1FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for second player of the " + secondTeamName + " Team");
        if (scanner.hasNextInt()) {
            t2P2FragCount = scanner.nextInt();
            System.out.println(secondTeamName + " Team second player frag count is " + t2P2FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for second player of the " + secondTeamName + " Team");
        if (scanner.hasNextInt()) {
            t2P3FragCount = scanner.nextInt();
            System.out.println(secondTeamName + " Team third player frag count is " + t2P3FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for fourth player of the " + secondTeamName + " Team");
        if (scanner.hasNextInt()) {
            t2P4FragCount = scanner.nextInt();
            System.out.println(secondTeamName + " Team fourth player frag count is " + t2P4FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for fifth player of the " + secondTeamName + " Team");
        if (scanner.hasNextInt()) {
            t2P5FragCount = scanner.nextInt();
            System.out.println(secondTeamName + " Team fifth player frag count is " + t2P5FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        double AvgFirstTeamScore = (double)(t1P1FragCount + t1P2FragCount + t1P3FragCount + t1P4FragCount + t1P5FragCount) / 5;
        double AvgSecondTeamScore = (double)(t2P1FragCount + t2P2FragCount + t2P3FragCount + t2P4FragCount + t2P5FragCount) / 5;
        int FirstTeamScore = t1P1FragCount + t1P2FragCount + t1P3FragCount + t1P4FragCount + t1P5FragCount;
        int SecondTeamScore = t2P1FragCount + t2P2FragCount + t2P3FragCount + t2P4FragCount + t2P5FragCount;
        String winner;
        int winnerScore;
        if (FirstTeamScore > SecondTeamScore) {
            winner = firstTeamName;
            winnerScore = FirstTeamScore;
            System.out.println("Перемогла Команда " + winner + ", вона набрала " + winnerScore + " Очків");
        }
        else if (FirstTeamScore < SecondTeamScore) {
            winner = secondTeamName;
            winnerScore = SecondTeamScore;
            System.out.println("Перемогла Команда " + winner + ", вона набрала " + winnerScore + " Очків");
        }
        else  {
            winnerScore = FirstTeamScore;
            System.out.println("Нічия" + ", обидві команди набрали " + winnerScore + " Очків");
        }
        System.out.println("Середня кількість очків команди " + firstTeamName + " Становить " + AvgFirstTeamScore);
        System.out.println("Середня кількість очків команди " + secondTeamName + " Становить " + AvgSecondTeamScore);
    }
}