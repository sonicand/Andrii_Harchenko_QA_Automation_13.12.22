package lesson10;

public class BurgerMain {

    public static void main(String[] args) {

        burger burger1 = new burger();
        burger burger2 = new burger(true, true, true, true);
        burger burger3 = new burger(true, true, true, true, true);

    }

}

class burger {

    boolean bun;
    boolean meat;
    boolean cheese;
    boolean lettuce;
    boolean mayonnaise;

    public burger() {

        this.bun = true;
        this.meat = true;
        this.cheese = true;
        this.lettuce = true;
        this.mayonnaise = true;

        System.out.println("Звичайний бургер: булочка, м'ясо, сир, зелень, майонез");
    }
    public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = false;

        System.out.println("Діетичний бургер: булочка, м'ясо, сир, зелень");

    }
    public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce, boolean mayonnaise) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;

        System.out.println("Веганський бургер: булочка, сир, зелень, майонез");

    }

}