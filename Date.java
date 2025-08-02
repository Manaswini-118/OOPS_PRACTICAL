package myproject;
import java.time.LocalDateTime;

public class Date {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        
        System.out.println(current);
        System.out.println(current.getMonthValue());
        System.out.println(current.getYear());
        System.out.println(current.getHour());
        System.out.println(current.getMinute());
    }
}
