package lesson5;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first team name");
        String FirstTeamName = scanner.nextLine();
        System.out.println("First team name is " + FirstTeamName);
        System.out.println("Please enter frag amount for first player of the " + FirstTeamName + " Team");
        int T1P1FragCount = 0;
        int T1P2FragCount = 0;
        int T1P3FragCount = 0;
        int T1P4FragCount = 0;
        int T1P5FragCount = 0;
        if (scanner.hasNextInt()) {
            T1P1FragCount = scanner.nextInt();
            System.out.println(FirstTeamName + " Team first player frag count is " + T1P1FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for second player of the " + FirstTeamName + " Team");
        if (scanner.hasNextInt()) {
            T1P2FragCount = scanner.nextInt();
            System.out.println(FirstTeamName + " Team second player frag count is " + T1P2FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for second player of the " + FirstTeamName + " Team");
        if (scanner.hasNextInt()) {
            T1P3FragCount = scanner.nextInt();
            System.out.println(FirstTeamName + " Team third player frag count is " + T1P3FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for fourth player of the " + FirstTeamName + " Team");
        if (scanner.hasNextInt()) {
            T1P4FragCount = scanner.nextInt();
            System.out.println(FirstTeamName + " Team fourth player frag count is " + T1P4FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for fifth player of the " + FirstTeamName + " Team");
        if (scanner.hasNextInt()) {
            T1P5FragCount = scanner.nextInt();
            System.out.println(FirstTeamName + " Team fifth player frag count is " + T1P5FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        scanner.nextLine();
        System.out.println("Please enter second team name");
        String SecondTeamName = scanner.nextLine();
        System.out.println("Second team name is " + SecondTeamName);
        int T2P1FragCount = 0;
        int T2P2FragCount = 0;
        int T2P3FragCount = 0;
        int T2P4FragCount = 0;
        int T2P5FragCount = 0;
        System.out.println("Please enter frag amount for first player of the " + SecondTeamName + " Team");
        if (scanner.hasNextInt()) {
            T2P1FragCount = scanner.nextInt();
            System.out.println(SecondTeamName + " Team first player frag count is " + T2P1FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for second player of the " + SecondTeamName + " Team");
        if (scanner.hasNextInt()) {
            T2P2FragCount = scanner.nextInt();
            System.out.println(SecondTeamName + " Team second player frag count is " + T2P2FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for second player of the " + SecondTeamName + " Team");
        if (scanner.hasNextInt()) {
            T2P3FragCount = scanner.nextInt();
            System.out.println(SecondTeamName + " Team third player frag count is " + T2P3FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for fourth player of the " + SecondTeamName + " Team");
        if (scanner.hasNextInt()) {
            T2P4FragCount = scanner.nextInt();
            System.out.println(SecondTeamName + " Team fourth player frag count is " + T2P4FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        System.out.println("Please enter frag amount for fifth player of the " + SecondTeamName + " Team");
        if (scanner.hasNextInt()) {
            T2P5FragCount = scanner.nextInt();
            System.out.println(SecondTeamName + " Team fifth player frag count is " + T2P5FragCount);
        } else {
            System.out.println("Entered Wrong data!");
            System.exit(0);
        }
        double AvgFirstTeamScore = (double)(T1P1FragCount + T1P2FragCount + T1P3FragCount + T1P4FragCount + T1P5FragCount) / 5;
        double AvgSecondTeamScore = (double)(T2P1FragCount + T2P2FragCount + T2P3FragCount + T2P4FragCount + T2P5FragCount) / 5;
        int FirstTeamScore = T1P1FragCount + T1P2FragCount + T1P3FragCount + T1P4FragCount + T1P5FragCount;
        int SecondTeamScore = T2P1FragCount + T2P2FragCount + T2P3FragCount + T2P4FragCount + T2P5FragCount;
        String winner;
        int winnerScore;
        if (FirstTeamScore > SecondTeamScore) {
            winner = FirstTeamName;
            winnerScore = FirstTeamScore;
            System.out.println("Перемогла Команда " + winner + ", вона набрала " + winnerScore + " Очків");
        }
        else if (FirstTeamScore < SecondTeamScore) {
            winner = SecondTeamName;
            winnerScore = SecondTeamScore;
            System.out.println("Перемогла Команда " + winner + ", вона набрала " + winnerScore + " Очків");
        }
        else  {
            winnerScore = FirstTeamScore;
            System.out.println("Нічия" + ", обидві команди набрали " + winnerScore + " Очків");
        }
        System.out.println("Середня кількість очків команди " + FirstTeamName + " Становить " + AvgFirstTeamScore);
        System.out.println("Середня кількість очків команди " + SecondTeamName + " Становить " + AvgSecondTeamScore);
    }
}