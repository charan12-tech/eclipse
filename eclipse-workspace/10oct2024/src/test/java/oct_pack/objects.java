package oct_pack;

class Box
{
	static double w=30;
	static double h=10;
	static double l=20;
	int boxid;
	public static double calvolume()
	{
		double douttemp=0;
		douttemp=w*h*l;
		System.out.println(douttemp);
		return douttemp;
	}
}

public class objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box();
		b.calvolume();

	}

}
