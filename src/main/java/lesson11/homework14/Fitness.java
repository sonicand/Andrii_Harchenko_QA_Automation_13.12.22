package lesson11.homework14;

public class Fitness {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;

    String surname;
    int weight;
    int pressure;
    int stepsByDay;
    int age;

    Fitness(String name, int dayOfBirth, int monthOfBirth,
            int yearOfBirth, String email, String phone,
            String surname, int weight, int pressure, int stepsByDay) {

        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsByDay = stepsByDay;
        this.age = 2023 - yearOfBirth;
    }

    public String getName() {
        return this.name;
    }
    public int getDayOfBirth() {
        return this.dayOfBirth;
    }
    public int getMonthOfBirth() {
        return this.monthOfBirth;
    }
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getPressure() {
        return this.pressure;
    }
    public int getStepsByDay() {
        return this.stepsByDay;
    }
    public int getAge() {
        return this.age;
    }



    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void setStepsByDay(int stepsByDay) {
        this.stepsByDay = stepsByDay;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccountInfo:\n" +
                "name " + this.name + "\n" +
                "dayOfBirth " + this.dayOfBirth + "\n" +
                "monthOfBirth " + this.monthOfBirth + "\n" +
                "yearOfBirth " + this.yearOfBirth + "\n" +
                "email " + this.email + "\n" +
                "phone " + this.phone + "\n" +
                "surname " + this.surname + "\n" +
                "weight " + this.weight + "\n" +
                "pressure " + this.pressure + "\n" +
                "stepsByDay " + this.stepsByDay + "\n" +
                "age " + this.age + "\n";
    }

    public static void main(String args[]) {
        new Fitness("Andrii", 6, 5, 1996, "testmail@gmail.com", "+1234567890", "Harchenko", 69, 65, 8000).printAccountInfo();
        new Fitness("Serhii", 14, 12, 1969, "testmail@gmail.com", "+1234567890", "Harchenko", 75, 80, 3400).printAccountInfo();
        new Fitness("Svitlana", 12, 5, 1975, "testmail@gmail.com", "+1234567890", "Harchenko", 75, 75, 6800).printAccountInfo();

        Fitness change1 = new Fitness("Before", 1, 2, 2000, "changed@gmail.com", "+123987564", "Changes", 100, 95, 3500);
        change1.printAccountInfo();
        change1.setSurname("Changed");
        change1.setWeight(99);
        change1.setPressure(88);
        change1.setStepsByDay(12345);
        change1.printAccountInfo();

        Fitness change2 = new Fitness("Before", 2, 3, 2005, "changed@gmail.com", "+123987564", "Changes", 110, 120, 4500);
        change2.printAccountInfo();
        change2.setSurname("Changed");
        change2.setWeight(81);
        change2.setPressure(74);
        change2.setStepsByDay(10111);
        change2.printAccountInfo();

    }
}

