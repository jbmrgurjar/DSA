            // You are given three sides of a triangle. Check 
            // whether given triangle is valid or not.
            import java.util.*;
public class valid_not_triangle{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter 1st Side: ");
				int a = sc.nextInt();
				System.out.print("Enter 2nd Side: ");
				int b = sc.nextInt();
				System.out.print("Enter 3rd Side: ");
				int c = sc.nextInt();

				if(a+b>c){
						if(b+c>a){
								if(a+c>b){
										System.out.println("Valid Triangle");
								}
								else{
										System.out.println("Invalid Triangle");
								}
						}
						else{
								System.out.println("Invalid Triangle");
						}
				}
				else{
						System.out.println("Invalid Triangle");
				}
		}
}