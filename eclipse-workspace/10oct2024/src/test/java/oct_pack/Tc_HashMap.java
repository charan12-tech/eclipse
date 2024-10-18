package oct_pack;

import java.util.HashMap;

public class Tc_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> h=new HashMap<String,String>();
		
		h.put("1001","Keerthi");
		h.put("1002","Deepa");
		h.put("1003","Arun");
		h.put("1004","Leena");
		
		System.out.println(h.get("1002"));

	}

}
