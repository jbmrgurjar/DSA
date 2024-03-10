// 2.write a program You are given the length and breadth of a 
// rectangle. Check whether it is square or not.

import java.util.*;
public class squre_or_not
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int l = sc.nextInt();
		System.out.print("Enter Breadth: ");
		int b = sc.nextInt();
		
		if(l==b){
		    System.out.print("It is a square");
		}
		else{
		    System.out.print("It is not a square");
		}
	}
}