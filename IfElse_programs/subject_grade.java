/* QUESTION-7)	Write a program to input marks of five subjects Physics'
     Chemistry, Biology, Mathematics and Computer. Calculate 
     percentage and grade according to following: 
      Percentage >= 90%: Grade A
      Percentage >= 80%: Grade B
      Percentage >= 70%: Grade C
      Percentage >= 60%: Grade D
      Percentage >= 40%: Grade E     
      Percentage < 40%: Grade F  */

import java.util.*;
public class subject_grade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int phy=sc.nextInt();
        int che=sc.nextInt();
        int bio=sc.nextInt(); 
        int math=sc.nextInt();
        int com=sc.nextInt(); 

        int totalmarks=phy+che+bio+math+com;
        System.out.println(totalmarks);
      int percentage=totalmarks/5;
      
      if(percentage>90){
        System.out.println("grade A");
      }
      else if(percentage>80){
        System.out.println("grade B");
      }
      else if(percentage>70){
        System.out.println("grade C");
      }
      else if(percentage>60){
        System.out.println("grade D");
      }
      else if(percentage>40)
      {
        System.out.println("grade E");
    }
    else if(percentage<40){
        System.out.println("fail");
    }
}
}