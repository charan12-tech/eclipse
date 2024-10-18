package Lab3;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
	
}


public class ques2 {
	private int Age;
	
	public int getAge()
	{
		return Age;
	}
	public void setAge(int Age) throws InvalidAgeException
	{
		if(Age<15)
		{
			throw new InvalidAgeException("Age must be greater than 15");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques2 obj=new ques2();
		try {
		obj.setAge(13);
		System.out.println("Age is "+obj.getAge());
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
