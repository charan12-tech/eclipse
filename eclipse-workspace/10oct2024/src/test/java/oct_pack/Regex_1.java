package oct_pack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Regex_1 {
	public static void main(String args[]) {
		String inputstr="Apple";
		String pattern="Appl";
		boolean pat=Pattern.matches(pattern,inputstr);
		System.out.println("The pattern is :"+pat);
		String input="hop,mop,hopping,shopping";
		Pattern p1=Pattern.compile("hop");
		Matcher m1=p1.matcher(input);
		System.out.println(m1.matches());
		while(m1.find()) {
			System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
		}
		String input1="Exo1";
		Pattern p2=Pattern.compile("^[A-Za-z].*[0-9]$");
		Matcher m2 = p2.matcher(input1);
		if(m2.find())
		{
			System.out.println("found");
		}
		else
			System.out.println("not found");

		String mail="charanpanamata@gmail.com";
		Pattern p3=Pattern.compile("^[A-Za-z].*+@+[a-z].*");
		Matcher m3 = p3.matcher(mail);
		if(m3.find())
		{
			System.out.println("found");
		}
		else
			System.out.println("not found");

		//Digit pattern
		String number="1234567890";
		Pattern p4=Pattern.compile("^\\d{10}$");
		Matcher m4 = p4.matcher(number);
		if(m4.find())
		{
			System.out.println("found");
		}
		else
			System.out.println("not found");
		//Non-Digit pattern
		String nondigit="#####%^&*(";
		Pattern p5=Pattern.compile("^\\D{10}$");
		Matcher m5 = p5.matcher(nondigit);
		if(m5.find())
		{
			System.out.println("found");
		}
		else
			System.out.println("not found");
		//white space pattern
		String space="welcome  charan";
		Pattern p6=Pattern.compile("\\s");
		Matcher m6 = p6.matcher(space);
		while(m6.find())
		{
			System.out.println(m6.group()+":"+m6.start());
		}

		//Non-white space pattern
		String nonspace="welcome charan";
		Pattern p7=Pattern.compile("\\S");
		Matcher m7 = p7.matcher(nonspace);
		while(m7.find())
		{
			//System.out.println("found");
			System.out.println(m7.group()+" the position is :"+m7.start());
		}
		//beginning of the line and end of the line pattern
		String begin="welcome charan ran";
		Pattern p8=Pattern.compile("^welcome.*ran$");
		Matcher m8 = p8.matcher(begin);
		if(m8.find())
		{
			System.out.println("found");
			//System.out.println(m7.group()+"the position is :"+m7.start());
		}else {
			System.out.println("not found");
		}
		String email="charanpanamata_12k5@gmail.com";
		Pattern p9=Pattern.compile("^[\\w._]+@\\w]+\\.[\\w.]{3,6}$");
		Matcher m9=p9.matcher(email);
		if(m9.find())
		{
			System.out.println("email found");
			System.out.println(m9.group()+":"+m9.start()+":"+m9.end());
		
		}
		else
		{
			System.out.println("email not found");
		}
		
 
	}
 
}