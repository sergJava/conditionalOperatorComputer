import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }


        System.out.println("Task 2");
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }


        System.out.println("Task 3");
        int year = 1700;
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("год должен быть больше, чем 1584");
        }


        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("доставки нет");
        }


        System.out.println("Task 5");

        int monthNumber = 12;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.printf("месяц под номером %d принадлежит к сезону зима", monthNumber);
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.printf("месяц под номером %d принадлежит к сезону весна", monthNumber);
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.printf("месяц под номером %d принадлежит к сезону лето", monthNumber);
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.printf("месяц под номером %d принадлежит к сезону осень", monthNumber);
                    break;
            }
        } else {
            System.out.println("не корректный номер месяца");
        }
    }
}