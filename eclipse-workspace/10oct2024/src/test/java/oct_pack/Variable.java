package oct_pack;

public class Variable {
	private static double dblwidth=10;
	private static double dblheight=20;
	private static double dbldepth=4;
	private static int boxid;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calvolume();
	}
	public static double calvolume()
	{
		double doutemp=0;
		doutemp=dblwidth*dblheight*dbldepth;
		System.out.println(doutemp);
		return doutemp;
	}

}
