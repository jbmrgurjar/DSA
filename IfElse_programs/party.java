            // You organised a party with the condition that 
            // entry is for couple only. You are given the 
            // number  of guests present in the party. Check 
            // whether all are in pair or there is any single 
            // person there. 


            import java.util.*;
public class paty{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Guest");
		int G=sc.nextInt();
		int P=G%2;

		if(P==0){
			System.out.println("no extra person");
		}
		else{
			System.out.println(P +"  extra person");
			}





		}	
	}