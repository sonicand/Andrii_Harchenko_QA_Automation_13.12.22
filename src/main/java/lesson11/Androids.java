package lesson11;

public class Androids implements Smartphones, LinuxOS {

        public void call() {

            System.out.println("Android default caller");

        }

        public void sms() {

            System.out.println("SMS");

        }

        public void internet() {

            System.out.println("Chrome Browser");

        }

        public void openSource() {

            System.out.println("Android is free");

        }

    }
