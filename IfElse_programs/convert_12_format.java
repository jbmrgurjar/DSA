
        // You are given time in 24-hour format. Convert it 
        // into 12-hour format.


        import java.util.*;
public class convert_12_format{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter hour: ");
				int h = sc.nextInt();
				System.out.print("Enter minute: ");
				int m = sc.nextInt();
				if(h<12){
						System.out.println(h+":"+m+" AM");
				}
				else{
						if(h==12){
								System.out.println(h+":"+m+" PM");
						}
						else{
								System.out.println((h-12)+":"+m+" PM");
						}
				}
		}
}