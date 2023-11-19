import java.time.LocalDate;

public class HomeWorkMethods {
    public static void main(String[] args) {
        task1(2023);
//        task2();
//        task3();
    }

    public static void task1(int year){
        System.out.println("Task1");
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Високостный");
        } else {
            System.out.println("Не високостный");
        }
    }

    public static void task2(int year){
        System.out.println("Task2");
        int currentYear = LocalDate.now().getYear();
        int systemClient = 0;
        if (systemClient == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (systemClient == 0 && year == currentYear) {
            System.out.println("Установите обычную версию");
        } else if (systemClient == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
}
