            // Tell how is the weather. 
            // Temp < 0, then Freezing Weather 
            // Temp 0-10, then Very Cold 
            // Temp 10-20, then Cold 
            // Temp 20-30, then Normal 
            // Temp 30-40, then Its hot 
            // Temp >=40, then Its very hot 

            import java.util.*;
public class weather{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter temperature: ");
				int n = sc.nextInt();
				if(n<0){
						System.out.println("Freezing weather");
				}
				else if(n<10){
						System.out.println("Weather is very Cold");
				}
				else if(n<20){
						System.out.println("Weather is cold");
				}
				else if(n<30){
						System.out.println("Normal weather");
				}
				else if(n<40){
						System.out.println("It’s Hot");
				}
				else {
						System.out.println("Its very hot");
				}
		}
}