package Lab2.exception;

import Lab2.bean.*;

class EmployeeSalaryException extends Exception
{
	public EmployeeSalaryException(String message)
	{
		super(message);
	}
}

public class EmployeeException {

	private double Salary;
	public double getSalary()
	{
		return Salary;
	}
	public void setSalary(double Salary) throws EmployeeSalaryException
	{
		if(Salary<3000)
		{
			throw new EmployeeSalaryException("Salary below 3000 is not valid");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeException obj=new EmployeeException();
		try
		{
			obj.setSalary(2000);
			System.out.println(obj.getSalary());
		}
		catch(EmployeeSalaryException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
