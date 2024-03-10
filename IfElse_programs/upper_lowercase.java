                // You are given a character. Check whether it is in 
                // lowercase or uppercase. 

                import java.util.*;
public class upper_lowercase{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter an alphabet: ");
				char c = sc.next().charAt(0);
				if(c>='A' && c<='Z' ){
						System.out.println("It is a UpperCase");
				}
				else{
						System.out.println("It is LowerCase");
				}
		}
}