        // You are given a number. Print “Coding” if the 
        // number is divisible by 2, print “Thinker” if the 
        // number is divisible by 3, print “Coding Thinker” 
        // if the number is divisible by both 2 and 3. 


        import java.util.*;
public class coding_Thinker{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a Number: ");
				int n = sc.nextInt();
				if(n%2==0){
						if(n%3==0){
								System.out.println("Coding Thinker");
						}
						else{
								System.out.println("Coding");
						}
				}
				else{
						if(n%3==0){
								System.out.println("Thinker");
						}
				}
		}
}