package oct_pack;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;


import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant CurrentTime=Instant.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		LocalDate now=LocalDate.now();
		
		System.out.println("Today is "+now);
		
		System.out.println("tomorrow "+now.plusDays(1));
		
		System.out.println("yesterday "+now.minusDays(1));
		
		System.out.println("current time is "+CurrentTime);
		
		System.out.println("is leap? "+now.isLeapYear());
		
		System.out.println("move to 30th day of month "+now.withDayOfYear(30));
		
		ZonedDateTime ct=ZonedDateTime.now();
		
		System.out.println("Zone date and time "+ct);
		
		ZonedDateTime ct_paris=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		System.out.println("Paris time is "+ct_paris);
		
		System.out.println("tomorrow "+ct_paris.plusDays(1));
		
		System.out.println("yesterday "+ct_paris.minusDays(1));
		
		System.out.println("current time is "+ct_paris.minusMonths(1));
		
		LocalDate start=LocalDate.of(1947, Month.AUGUST, 15);
		LocalDate end=LocalDate.now();
		Period period=start.until(end);
		
		System.out.println("Days:"+period.get(ChronoUnit.DAYS));
		
		
		
		
		


	}

}
