package lab2prgs;
import java.util.Date;
public class Date_time {
	public static void main(String[] args) {
        Date d=new Date();

        System.out.println("Current Date and Time: " + d);

        System.out.println("Time in milliseconds since Jan 1, 1970: " +d.getTime());
        System.out.println("Day of the month: " +d.getDate());
        System.out.println("Month: " +(d.getMonth()+1));
        System.out.println("Year (since 1900): " +d.getYear());
        System.out.println("Hours: " +d.getHours());
        System.out.println("Minutes: " +d.getMinutes());
        System.out.println("Seconds: " +d.getSeconds());		
	}
}
