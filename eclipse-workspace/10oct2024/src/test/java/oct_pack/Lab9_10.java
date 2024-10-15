package oct_pack;

import java.util.Scanner;

public class Lab9_10 {
	
	public void option(int opt,String key)
	{
		
		switch(opt)
		{
		case 1:
		{
			System.out.println(key+key);
			break;
		}
		case 2:
		{
			String k="";
			for(int i=0;i<key.length();i++)
			{
				if(i%2==0)
				{
					k=k+key.charAt(i);
				}
				else
				{
					k+="#";
				}
			}
			System.out.println("Replaced string: " + k);  // Output the result
            break;
		}
		case 3:
		{
			String result = "";
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                if (result.indexOf(c) == -1) {  // If character not found in result, add it
                    result += c;
                }
            }
            System.out.println("String after removing duplicates: " + result);
            break;
			
		}
		case 4:
		{
			StringBuilder result = new StringBuilder(key);
            for (int i = 0; i < key.length(); i++) {
                if (i % 2 != 0) {  // Odd positions (1-based)
                    result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
                }
            }
            System.out.println("String after converting odd characters to uppercase: " + result.toString());
            break;
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String key=sc.nextLine();
		System.out.println("enter your choice from the list :\n1.add\n2.replace\n3.remove_duplicate\n4.odd_characters_to_uppercase");
		int opti= sc.nextInt();
		Lab9_10 obj=new Lab9_10();
		obj.option(opti,key);
		
		

	}

}
