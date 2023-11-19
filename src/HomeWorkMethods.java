import java.time.LocalDate;

public class HomeWorkMethods {
    public static void main(String[] args) {
//        task1(2023);
//        task2(2022);
        checkDeliveryTime(45);
    }

    public static void task1(int year) {
        System.out.println("Task1");
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " Високостный");
        } else {
            System.out.println("Не високостный");
        }
    }

    public static void task2(int year) {
        System.out.println("Task2");
        int currentYear = LocalDate.now().getYear();
        int systemClient = 1;
        if (systemClient == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (systemClient == 0 && year == currentYear) {
            System.out.println("Установите обычную версию");
        } else if (systemClient == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (systemClient == 1 && year == currentYear) {
            System.out.println("Установите обычную версию");
        }
    }

    public static void checkDeliveryTime(int distace) {
        System.out.println("Task 3");
        if (distace < 20) {
            System.out.println("Потребудется дней " + 1);
        } else if (distace >= 20 && distace <= 60) {
            System.out.println("Потребудется дней " + 2);
        } else if (distace >= 60 && distace <= 100) {
            System.out.println("Потребудется дней " + 3);
        }
    }
}
