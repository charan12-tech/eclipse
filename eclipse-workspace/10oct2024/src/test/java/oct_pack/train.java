package oct_pack;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the period : ");
		int period=sc.nextInt();
		int count = 1;
		LocalDate start_train = LocalDate.now();
		LocalDate end_train = start_train;
		while(count<period){
			//DayOfWeek day = date.getDayOfWeek();
			 DayOfWeek day = end_train.getDayOfWeek(); 
			if(day ==day.FRIDAY) {
				end_train=end_train.plusDays(3);
				count++;
			}
			else 
			{
				end_train=end_train.plusDays(1);
				count++;
			}
		
			
		}
		System.out.println("end date is "+end_train);

	}

}
