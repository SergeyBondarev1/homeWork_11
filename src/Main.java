public class Main {
    public static void main(String[] args) {
      task1();
      task2();
      task3();
    }


    public static void calculationLeapYear(int year){
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task1(){
        System.out.println("Задача №1");
        int year = 2021;
        calculationLeapYear(year);
    }

    public static void installClientVersion(int clientOS, int year){
        if (year <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2(){
        System.out.println("Задача №2");
        int OS = 1;
        int clientDeviceYear = 2020;
        installClientVersion(OS,clientDeviceYear);
    }

    public static void calculationDeliveryTime(int deliveryDistance, int days){
        if (deliveryDistance < 20) {
            System.out.println("Доставка в пределах 20 км занимает сутки");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах от 20 км до 60 км занимает " + (days + 1) + " дня");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах 60 км до 100 км добавляет " + (days + 2) + " дня");
        }
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void task3(){
        System.out.println("Задача №3");
        int distance = 101;
        int day = 1;
        calculationDeliveryTime(distance,day);
    }
}
