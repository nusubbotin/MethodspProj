import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
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
}