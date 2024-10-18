package oct_pack;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s1=new HashSet<Integer>();
		
		s1.add(100);
		s1.add(1000);
		s1.add(10000);
		s1.add(100);
		s1.add(1000);
		
		System.out.println("size"+s1.size());
		for(Integer index:s1)
		{
			System.out.println(index+"");
		}
		
		HashSet<String> s2=new HashSet<String>();
		s2.add("z");
		s2.add("Q");
		s2.add("B");
		s2.add("z");
		s2.add("A");
		
		for(String index1:s2)
		{
			System.out.println(index1+"");
		}

	}

}
