import java.util.*;

class nested4_ter {
    public static void main(String[] args) {
		
		 System.out.println("Enter number for a,b,c,d");
	    Scanner value = new Scanner(System.in);
		int a = value.nextInt();
		int b = value.nextInt();
		int c = value.nextInt();
		int d = value.nextInt();
		String num = (a>b && a>c && a>d)? " a is bigest number" : (b>c && b>d)? " b is bigest number" : (c>d)?" c is bigest number" :"d is bigest number" ;
	    System.out.println(num);
	}
}