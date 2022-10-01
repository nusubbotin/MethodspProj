import java.time.LocalDate;
import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        int currentYear = LocalDate.now().getYear();
        isLeapYear(currentYear);
    }

    private static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " — високосный год");
        }else{
            System.out.println(year + " не високосный год");
        }
    }

    private static void checkProgVersion(int osType, int clientDeviceYear) {
        String messInfo;
        if (clientDeviceYear < 2015){
            messInfo = "Установите облегченную версию приложения для ";
        }else {
            messInfo = "Установите стандартную версию приложения для ";
        }
        if (osType == 0) {
            messInfo = messInfo + "iOS";
        }else if (osType == 1){
            messInfo = messInfo + "Android";
        } else {
            throw new RuntimeException("Не корректные входные данные! Параметр osType может принимать только значения: \n"
                    + "0 - iOS, 1 - Android");
        }
        messInfo = messInfo + " по ссылке";
        System.out.println(messInfo);
    }

    private static void task2() {
        System.out.println("Задание 2:");

        int currentYear = LocalDate.now().getYear();
        checkProgVersion(0, currentYear);
    }

    private static void task3() {
        System.out.println("Задание 3:");
        getDeliveryTime(95);
    }

    private static void getDeliveryTime(int deliveryDistance) {
        double deliveryTime;
        int deliveryTimeInt;

        deliveryDistance = deliveryDistance - 20;

        deliveryTime = (float) deliveryDistance / 40;
        deliveryTime = deliveryTime + 1;

        deliveryTimeInt = (int) deliveryTime;

        if (deliveryTime > deliveryTimeInt) {
            deliveryTimeInt++;
        }

        System.out.println("Потребуется дней: " + deliveryTimeInt);
    }
}