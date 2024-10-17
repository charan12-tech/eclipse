package oct_pack;

public class Tc_Exception {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		try
		{
		String str=null;
		str.equals("hello");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("hello guys");
		try
		{
			int a=0;
			int b=30/a;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

}

}
