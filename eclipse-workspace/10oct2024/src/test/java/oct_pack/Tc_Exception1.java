package oct_pack;

public class Tc_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int res=10/0;
			int[] numbers= {1,2,3};
			System.out.println(numbers[1]);
			
			String text=null;
			System.out.println("Length of the string is:"+text.length());
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arthimetic erro"+e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Arra index error :"+e1.getMessage());
			
		}
		catch(NullPointerException e2)
		{
			System.out.println("Null pointer ecxeption"+e2.getMessage());
		}
		catch(Exception e3)
		{
			System.out.println("unexpected error"+e3.getMessage());
		}
		finally
		{
			System.out.println("this is final block");
		}

	}

}
