package oct_pack;

import java.io.FileNotFoundException;

import java.io.FileReader;
 
public class Throw {

	static void fileopen() throws FileNotFoundException

	{

		System.out.println("Inside the method");

		FileReader fd=new FileReader("text.txt");

	}
 
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		try {

			fileopen();

		}catch(FileNotFoundException e)

		{

			System.out.println(e.getMessage());

		}

	}
 
}
 