import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class dateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // System.out.println(date.getYear());
        // System.out.println(date.getMonthValue());
        // System.out.println(date.getDayOfMonth());
        // System.out.println(date.plusDays(10));

        ZoneId z = ZoneId.of("Asia/Kolkata");
        LocalTime time = LocalTime.now(z);
        // System.out.println(z);
        // System.out.println(times);

        int c=0;

        for (String timeZones : ZoneId.getAvailableZoneIds()) {
            ZoneId zones = ZoneId.of(timeZones);
            c++;
            LocalTime times = LocalTime.now(zones);
            System.out.println(c+". "+timeZones+" -> "+times);

            
        }



    }

}
