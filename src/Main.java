import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        determiningleapYear(1999);   // Ввод: Год для проверки високосного года
        analysisClientDevice(1, 2017);  // Ввод: 0 для iOS и 1 для Android, Ввод: год устройства.
        сalculationOfDeliveryTime(18); // Ввод: расстояние в км

    }

    //Решение к 23 октября задачи 1
    public static void determiningleapYear(int year) {
//Методы. Задача 1
        System.out.println("Методы. Задача 1");
        boolean leapYear = leapYearCalculations(year);
        сheckingYear(year, leapYear);
        System.out.println();
    }

    private static boolean leapYearCalculations(int year) {

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

    private static void сheckingYear(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }


    //Решение к 23 октября задачи 2
    public static void analysisClientDevice(int clientOS, int clientDeviceYear) {

        System.out.println("Методы. Задача 2");

        boolean deviceYear = specifyTheOS(clientDeviceYear);
        if (clientOS == 0) {
            if (deviceYear) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (deviceYear) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
            System.out.println("https://,,,,,,,,,,,,,");
            System.out.println();
        }
    }

    private static boolean specifyTheOS(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        return clientDeviceYear <= currentYear;
    }


    //Решение к 23 октября задачи 3
    public static void сalculationOfDeliveryTime(int deliveryDistance) {
        //Методы. Задача 3
        System.out.println("Методы. Задача 3");


        //int oneDay = 1;
        int nextDayKm = 40;
        int deliveryTime = (deliveryDistance - 20) / nextDayKm;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
            System.out.println();
        } else {
            System.out.println("Потребуется дней: " + (2 + deliveryTime));
            System.out.println();
        }
    }
}
