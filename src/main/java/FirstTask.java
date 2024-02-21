import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yilni kiriting: ");
        int year=scanner.nextInt();
        System.out.println("Oy raqamini kiriting: ");
        int month=scanner.nextInt();
        System.out.println("Sana ni kiriting: ");
        int day=scanner.nextInt();
        LocalDate localDate=LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}

