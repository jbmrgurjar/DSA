            // You are given three sides of a triangle. Check 
            // whether triangle is equilateral, isosceles, or 
            // scalene.
            import java.util.*;
public class triangle{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter 1st Side: ");
				int a = sc.nextInt();
				System.out.print("Enter 2nd Side: ");
				int b = sc.nextInt();
				System.out.print("Enter 3rd Side: ");
				int c = sc.nextInt();

				if(a==b){
						if(b==c){
								System.out.println("Equilateral Triangle");
						}
						else{
								System.out.println("Isoceles Triangle");
						}
				}
				else{
						if(b==c){
								System.out.println("Isoceles Triangle");
						}
						else{
								if(a==c){
										System.out.println("Isoceles Triangle");
								}
								else{
										System.out.println("Scalene Triangle");
								}
						}
				}
		}
}