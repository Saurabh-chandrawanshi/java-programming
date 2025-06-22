import java.util.*;
class reverse 
	{
	public static void main (String args[])
		{
		
		int x,y;
		Scanner src = new Scanner(System.in);
		
	    System.out.print("enter the value of x =");
		x = src.nextInt();
		for (int i=0; i<=x; i++)
		{
			
		System.out.println(i);
	

		}System.out.println(" in reverse order");
	for ( int j=x;j>=0 ;j-- )
	{
		System.out.println(j);
		
	}
	
		
}
	}