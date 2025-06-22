import java.util.*;
class sum6
{
	public static void main (String args[])
	{
		Double m1,m2,m3,eds,java,sum1,per;
		Scanner val = new Scanner (System.in);
		
		System.out.println("Enter value of m1 =");
		m1 = val.nextDouble();
		System.out.println("Enter value of m2=");
		m2 = val.nextDouble();
		System.out.println("Enter value of m3=");
		m3 = val.nextDouble();
		System.out.println("Enter value of eds=");
		eds = val.nextDouble();
		System.out.println("Enter value of java =");
		java = val.nextDouble();
		
		 sum1 =( m1+m2+m3+eds+java);
		 System.out.println("sum value of subjects="+sum1);
		per = sum1/5;
		System.out.println("persentage value of subjects="+per);
		}
	}
	
