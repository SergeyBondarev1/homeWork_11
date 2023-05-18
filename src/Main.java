public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void calculationLeapYear(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача №1");
        int year = 2021;
        calculationLeapYear(year);
    }

    public static void installClientVersion(int clientOS, int year) {
        if (year <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача №2");
        int OS = 1;
        int clientDeviceYear = 2020;
        installClientVersion(OS, clientDeviceYear);
    }

    public static int calculationDeliveryTime(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) {
            days ++;
        } else if (deliveryDistance <= 60) {
            days = days+2;
        } else if (deliveryDistance <= 100) {
            days = days+3;
        }
        return days;
    }

    public static void task3() {
        System.out.println("Задача №3");
        int deliveryDistance = 78;
        if (calculationDeliveryTime(deliveryDistance) != 0) {
            System.out.println("Потребуется дней для доставки: " + calculationDeliveryTime(deliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }

    }
}

