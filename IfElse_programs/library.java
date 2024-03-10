            // Calculate the fine on the book returned late in 
            // the library according to the given details: 
            // For first 3 days - Fine is 10rs 
            // For next 4-10 days - Fine is 20rs 
            // Above 10 days - Fine is 50rs 
            // If the book is returned after 30 days, 
            // membership will be cancelled. 
            import java.util.*;
public class library{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter no of days: ");
				int n = sc.nextInt();
				if(n<=3){
						System.out.println("Fine is 10rs");
				}
				else if(n<=10){
						System.out.println("Fine is 20rs");
				}
				else if(n<=30){
						System.out.println("Fine is 50rs");
				}
				else{
						System.out.println("Fine is 50rs and your membership is cancelled");
				}
		}
}