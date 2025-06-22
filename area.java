import java.util.*;
class area
{
	public static void main (String args[])
	{
		double r1,r2 ,area,circle,p = 3.14;
	
		Scanner src = new Scanner (System.in);
		System.out.println( " Enter value of r1 =" );
		
		 r1 = src.nextDouble();
		
		area = p *r1*r1;
		System.out.println( " value of area is ="+area );
		System.out.println( " Enter value of r2 =" );
		 r2 = src.nextDouble();
		
		 circle = 2*p *r2;
		System.out.println( " value of area is ="+circle );
	}
}