package MyJavaBasics;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		int []a=new int[5];
		
		int []b= {44,55,66,77,88};
		
		a[0]=10;
		a[1]=12;
		a[2]=34;
		a[3]=45;
		a[4]=56;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println();
		for(int y:b)
		{
			System.out.println(y);
		}
		
		

	}

}
