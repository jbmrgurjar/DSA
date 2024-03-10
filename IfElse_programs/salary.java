        // You are given basic salary of an employee and 
        // calculate its Gross salary according to following: -> Basic Salary <= 10000; HRA=20%, DA=80% -> 
        // Basic Salary <= 20000; HRA=25%, DA=90% -> Basic Salary >20000; HRA=30%, DA=95% 
        // Hint -> Gross Salary = basic Salary+HRA+DA 


        import java.util.*;
public class salary{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("BASIC SALARY");
        double basicsalary=in.nextDouble();
//Gross salary formula=basicsalary+HRA+DA;
        if(basicsalary<=10000){
            System.out.println(basicsalary+(basicsalary*20/100)+(basicsalary*80/100));
        }
        else if(basicsalary<=20000){
            System.out.println(basicsalary+(basicsalary*25/100)+(basicsalary*90/100));
        }
        else if(basicsalary>20000){
            System.out.println(basicsalary+(basicsalary*30/100)+(basicsalary*95/100));
        }
}
}
