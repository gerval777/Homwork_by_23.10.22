import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    //Решение к 23 октября задачи 1
    public static int enterTheYear() {
        int year = 2024;
        return year;
    }

    public static void leapYear() {
        System.out.println(enterTheYear() + " — високосный год");
        System.out.println();
    }

    public static void notLeapYear() {
        System.out.println(enterTheYear() + " — не високосный год");
        System.out.println();
    }

    public static void task1() {
        //Методы. Задача 1
        System.out.println("Методы. Задача 1");
        int year = enterTheYear();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leapYear();
        } else {
            notLeapYear();
        }
    }

    //Решение к 23 октября задачи 2
    public static int currentYear() {
        int currentYear = LocalDate.now().getYear();
        return currentYear;
    }

    public static int getClientOS(String specifyTheOS) {
//Для выбора ОС закомментируй строку ниже

        //if (specifyTheOS.equals("iOS")) {
        if (specifyTheOS.equals("Android")) {
            return 0;
        }
        return 1;
    }

    public static void task2() {
        //Методы. Задача 2
        System.out.println("Методы. Задача 2");

        String specifyTheOS = "iOS";
        int clientOS = getClientOS(specifyTheOS);
        int clientDeviceYear = currentYear();

        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
        System.out.println("https://,,,,,,,,,,,,,");
        System.out.println();
    }

    public static void task3(int deliveryDistance) {
        //Методы. Задача 3
        System.out.println("Методы. Задача 3");


        int oneDay = 1;
        int nextDayKm = 40;
        int deliveryTime = (deliveryDistance - 20) / nextDayKm;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + oneDay);
            System.out.println();
        } else {
            System.out.println("Потребуется дней: " + ((oneDay * 2) + deliveryTime));
            System.out.println();
        }
    }
}
