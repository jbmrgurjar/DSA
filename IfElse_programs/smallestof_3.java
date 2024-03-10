        // You are given 3 numbers. Find the smallest 
        // number among them without using logical 
        // operator. 
        import java.util.*;
public class smallestof_3{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();

        if(n1<n2){
            if(n2<n3){
                System.out.println(n1);
            }
            else{
                System.out.println(n3);
            }
        }
        else{
                if( n2<n3){
                System.out.println(n2);
                }
        
                    else {
                    System.out.println(n3);
                    }

    }
}
}