package lesson4;

public class Homework5 {
    public static void main(String[] args) {
        int liWarrior = 13;
        int liArcher = 24;
        int liCavalier = 46;
        int liEachTypeCount = 860;
        int miWarrior = 9;
        int miArcher = 35;
        int miCavalier = 12;
        double miEachTypeCount = (liEachTypeCount * 1.5);
        int liTotalAttackPower = (liWarrior * liEachTypeCount) + (liArcher * liEachTypeCount) + (liCavalier * liEachTypeCount);
        double miTotalAttackPower = (miWarrior * miEachTypeCount) + (miArcher * miEachTypeCount) + (miCavalier * miEachTypeCount);
        System.out.println("Загальна атака воїнів армії Лі " + liTotalAttackPower);
        System.out.println("Загальна атака воїнів армії Мі " + miTotalAttackPower);
    }
}
