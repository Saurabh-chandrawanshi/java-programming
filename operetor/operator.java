import java.util.*;

class nested_if3{
    public static void main(String[] args) {
		
		 System.out.println("Enter number for a,b,c");
	    Scanner value = new Scanner(System.in);
		int a = value.nextInt();
		int b = value.nextInt();
		int c = value.nextInt();
		if(a>b)
			{
			if(a>b){
				if(a>c){
					 System.out.println("a is bigest number");
				}
				else{
					if(b>c){
				
					 System.out.println("b is bigest number");
					
					}
					else{
						
					 System.out.println("b is bigest number");
					}
			}
       
			}
     
        }
	}
}
