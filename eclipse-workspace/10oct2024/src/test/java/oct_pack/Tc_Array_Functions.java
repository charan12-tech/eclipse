package oct_pack;

public class Tc_Array_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sqrs= {100,200,300,400};
		int arr[][]= {{2,3},{4,5}};
		int twodim[][]=new int[5][5];
		for(int j=0;j<5;j++)
		{
			for(int k=0;k<5;k++)
			{
				twodim[j][k]=10000;
				System.out.println(twodim[j][k]);
			}
	
		}
		System.out.println("Two dimentional :"+arr[0][0]);
		

	}

}
