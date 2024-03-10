            // You are given 3 numbers. Check whether all 
            // numbers are equal or not.


             import java.util.*;
public class threenum_equal_not{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter first number: ");
				int a = sc.nextInt();
				System.out.print("Enter second number: ");
				int b = sc.nextInt();
                System.out.print("Enter third number: ");
				int c = sc.nextInt();

                if(a==b){
                    if(b==c){
                        System.out.print("equal"); 
                    }
                    else if(b!=c){
                System.out.println("not equal");

               }
                }else{
                     System.out.print("not equal ");
                }
        }
}
