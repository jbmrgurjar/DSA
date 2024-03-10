            // A number is given to you. Find whether number 
            // is positive, negative or Zero.


            import java.util.*;
public class positive_neg_zero
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		if(n>0){
		    System.out.print("Number is positive");
		}
		else{
		    if(n==0){
		        System.out.print("Number is zero");
		    }
		    else{
		        System.out.print("Number is negative");
		    }
		}
	}
}