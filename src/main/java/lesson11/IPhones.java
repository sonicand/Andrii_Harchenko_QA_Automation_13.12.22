package lesson11;

public class IPhones implements Smartphones, IOS {

        public void call() {

            System.out.println("iPhone default caller");

        }

        public void sms() {

            System.out.println("SMS");

        }

        public void internet() {

            System.out.println("Safari Browser");

        }

        public void icloud() {

            System.out.println("Icloud storage");

        }

    }

