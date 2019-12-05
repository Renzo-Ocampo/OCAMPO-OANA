package Discrete_Structures_Final_Project;
import java.util.*;
import java.math.BigInteger;

public class combination extends permutation
{
    @Override
    public void operation()
    {
        Scanner sc=new Scanner(System.in);
        
        boolean condition;
        do
        {   
            System.out.println("\b");
            System.out.println("====COMBINATION====");
            System.out.println("This program accept numbers ranging from 1 to 500. ");            
            System.out.println("\b");
            System.out.print("Assign value for n: ");
            int n=sc.nextInt();
            System.out.print("Assign value for r: ");
            int r=sc.nextInt();

            if(n>500 || n<1)
                {
                    System.out.println("\b");
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else if(r>500 || r<1)
                {
                    System.out.println("\b");
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else
                {       
                    System.out.println("\b");
                    System.out.println("1) With repetition");
                    System.out.println("2) Without repetition");
                    System.out.print("please choose: ");
                    int choice = sc.nextInt();  

                    switch(choice)
                        {
                            case 1:
                                System.out.println("\b");
                                System.out.println("****Combination with repetitions****");
                                
                                if(n>=r)
                                    {
                                        System.out.println("\b");
                                        System.out.println(n+"C"+ r+" = "+combination1(n,r));
                                        condition=true;
                                    }
                                else
                                    {
                                        System.out.println("\b");
                                        System.out.println("n should be greater than r!");
                                        condition=false;
                                    }
                                break;
                                
                            case 2:
                                System.out.println("\b");
                                System.out.println("****Combination without repetitions****");
                                if(n>=r)
                                    {
                                        System.out.println("\b");
                                        System.out.println(n+"C"+ r+" = "+combination2(n,r));
                                        condition=true;
                                    }
                                else
                                    {
                                        System.out.println("\b");
                                        System.out.println("n should be greater than r!");
                                        condition=false;
                                    }
                                break;
                                
                            default:
                                System.out.println("\b");
                                System.out.println("The number you entered does not match the choices!");
                                condition = false;
                        }                  
                }          
        }
        while(condition==false);

        
 
    }
    @Override
    public  BigInteger factorial(int number)
        {
           BigInteger factorialInt= BigInteger.ONE;
            
           for(int i=number;i>=1;i--)
            {
               factorialInt=factorialInt.multiply(BigInteger.valueOf(i));
            }
           return factorialInt;
           
        }
    public  BigInteger combination2(int number1,int number2)
        {
            return factorial(number1).divide(factorial(number1-number2).multiply(factorial(number2)));
        }
    public  BigInteger combination1(int number1,int number2)
        {
            return (factorial((number1+number2)-1)).divide((factorial((number1)-1)).multiply(factorial(number2)));
        }
}
     

