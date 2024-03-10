// You are given the cost price and selling price of 
// a product. Check whether you are in profit or 
// loss. 
// Also print the amount of profit or loss.

import java.util.*;
public class profit_loss{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter cost price: ");
				int cp = sc.nextInt();
				System.out.print("Enter Selliing price: ");
				int sp = sc.nextInt();

				if(sp>cp){
						int x = sp-cp;
						System.out.println("Profit: "+x);
				}
				else{
						int x = cp-sp;
						System.out.println("Loss: "+x);
				}
		}
}