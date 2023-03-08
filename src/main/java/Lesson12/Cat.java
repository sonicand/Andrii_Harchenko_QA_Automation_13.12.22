package Lesson12;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = null;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 20) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 0 && weight <= 30) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }
    }


    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", 8, 4);
        barsik.setAge(88);
        barsik.setWeight(99);
        barsik.setName("");
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        if (Objects.equals(barsikName, "")) {
            System.out.println("Имя кота не должно быть Null");
        } else {
            System.out.println("Имя кота: " + barsikName);

        }
        if (barsikAge == 0) {
            System.out.println("Возраст кота должен быть в диапазоне от 0 до 15");
        } else {
            System.out.println("Возраст кота: " + barsikAge);
        }

        if (barsikWeight == 0) {
            System.out.println("Вес кота должен быть в диапазоне от 0 до 30");
        } else {
            System.out.println("Вес кота: " + barsikWeight);
        }
    }
}
