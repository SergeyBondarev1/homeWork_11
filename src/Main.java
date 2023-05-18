public class Main {
    public static void main(String[] args) {
      task1();
    }


    public static void leapYear(){
        //Немного не разобрался, могу ли я в методе инициализировать переменную как сделал ниже или это ошибка?
        int year = 2021;
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task1(){
        System.out.println("Задача №1");
        leapYear();





    }
}
