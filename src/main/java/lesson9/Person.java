package lesson9;

public class Person {
    public static void main(String[] args) {

    personInfo("Will", "Smith", "New York", "789456123");
    personInfo("Jackie", "Chan", "Shanghai", "123456789");
    personInfo("Sherlock", "Holmes", "London", "369852147");

    }

    static String personInfo(String firstName, String lastName, String city, String phone) {
        System.out.println("Зателефонувати громадянинові " + firstName + " " + lastName + " з міста " + city + " можна за номером " + phone);
        return firstName + lastName + city + phone;
    }
}
