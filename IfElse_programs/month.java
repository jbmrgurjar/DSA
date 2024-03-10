            //  You are given a number(1-12). Print the 
            // corresponding Month. 1 for January and 12 for 
            // December. 

            import java.util.*;
public class month{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter  the year");
        int y=sc.nextInt();

        System.out.println("enter the month");
        int m=sc.nextInt();

        if(m==1){
            System.out.println("jan is 31 days");
            }
        else if(m==2){
            if(y%4==0){
                System.out.println("feb is 29 days");
            }
            else{
                System.out.println("feb is 28days");
            }
        }
        else if(m==3){
            System.out.println("march is 31 days");
        }
        else if(m==4){
            System.out.println("april is 30 days");
        }
        else if(m==5){
            System.out.println("may is 31 days");
        }
        else if(m==6){
            System.out.println("june is 30 days");
        }
        else if(m==7){
            System.out.println("july is 31 days");
        }
        else if(m==8){
            System.out.println("auguest is 31 days");
        }
        else if(m==9){
            System.out.println("september is 30 days");
        }
        else if(m==10){
            System.out.println("octoberis 31 days");
        }
        else if(m==11){
            System.out.println("novemer is 30 days");
        }
        else if(m==12){
            System.out.println("decemeris 31 days");
        }
        else{
            System.out.println("not months");
        }   
    }
}