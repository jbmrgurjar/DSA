        // You are given time in 24-hour format. Check 
        // whether time is in Am or Pm.



        import java.util.*;
public class am_pm{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter hour: ");
				int h = sc.nextInt();
				System.out.print("Enter minute: ");
				int m = sc.nextInt();
				if(h<12){
						System.out.println("Time is in AM");
				}
				else{
						System.out.println("Time is in PM");
						
				}
		}
}