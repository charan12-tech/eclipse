package Lab3;

class InvalidFullNameException extends Exception
{
	public InvalidFullNameException(String message)
	{
		super(message);
	}
}

public class ques1 {
	
	private int age;
	private java.lang.String Lastname;
	private java.lang.String Firstname;
	
	public String getFirstName() {
		return Firstname;
	}

	public void setFirstName(String Firstname)throws InvalidFullNameException {
		if(Firstname==null|| Firstname.trim().isEmpty())
		{
			throw new InvalidFullNameException("first name should not be blank");
		}
		this.Firstname = Firstname;
	}
	public String getLastName() {
		return Lastname;
	}

	public void setLastName(String Lastname)throws InvalidFullNameException {
		if(Lastname==null|| Lastname.trim().isEmpty())
		{
			throw new InvalidFullNameException("Last name should not be blank");
		}
		this.Lastname = Lastname;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ques1 obj = new ques1();
		try
		{
			obj.setFirstName("charan");
			obj.setLastName("panamata");
			obj.setAge(25);
			System.out.println("First name is :"+obj.getFirstName());
			System.out.println("Last name is :"+obj.getLastName());
		}
		catch(InvalidFullNameException e)
		{
			System.out.println(e.getMessage());
			
		}
		try
		{
			obj.setFirstName("");
		}
		catch(InvalidFullNameException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			obj.setLastName("");
		}
		catch(InvalidFullNameException e)
		{
			System.out.println(e.getMessage());
		}

	}

}