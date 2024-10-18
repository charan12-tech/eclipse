package oct_pack;

public class Tc_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		char c;
		System.out.println("Enter a String");
		try
		{
			while((c=(char)System.in.read())!='\n')
			{
				sb.append(c);
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter while reading :");
		}
		String s=new String(sb);
		System.out.println("You entered :"+s);

	}

}
