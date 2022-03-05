package exercise;
import java.time.Instant;
import java.time.*;

public class Seven {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 10);
        LocalDate endDate = LocalDate.of(2022, 5, 15);
        Instant start = Instant.parse("2022-03-05T10:15:30.00Z");
        Instant end = Instant.parse("2022-03-05T10:20:30.00Z");

        Duration duration = Duration.between(start, end);


        Period period = Period.between(startDate, endDate);

        System.out.println(period.getYears() + " Tahun, " + period.getMonths() + " Bulan, " + period.getDays() + " Hari");
        System.out.println(duration.getSeconds() + " Detik");
    }
}
