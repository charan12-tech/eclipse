package oct_pack;

import java.util.Hashtable;

public class Tc_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> ht=new Hashtable<String,Double>();
		ht.put("Arun", 34.55);
		ht.put("Ram",45.66);
		ht.put("Pooja",456.34);
		
		System.out.println(ht);
		System.out.println(ht.keySet());
	}

}
