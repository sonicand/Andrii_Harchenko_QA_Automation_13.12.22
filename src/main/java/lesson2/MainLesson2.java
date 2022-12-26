package lesson2;

public class MainLesson2 {
    public static void main(String[] args) {

        double coordsNorth = 50.897211;
        double coordsEast = 34.808430;
        char degreeSign = '\u00B0';
        String homeAdress = "Prokof'jeva street";

        System.out.println(homeAdress);
        System.out.println("North" + " " + coordsNorth + degreeSign);
        System.out.println("East" + " " + coordsEast + degreeSign);
    }
}

