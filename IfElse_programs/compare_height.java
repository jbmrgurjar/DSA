//  1. write a program Compare heights of two persons and tell who is taller. 

import java.util.*;
public class compare_height
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter height of jbmr: ");
		int a = sc.nextInt();
		System.out.print("Enter height of vishnu: ");
		int b = sc.nextInt();
		
		if(a>b){
		    System.out.print("jbmr is taller");
		}
		else{
		    System.out.print("vishnu is taller");
		}
	}
}