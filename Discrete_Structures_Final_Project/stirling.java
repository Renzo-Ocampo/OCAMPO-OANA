
package Discrete_Structures_Final_Project;

import java.util.*;
import java.math.BigInteger;
public class stirling extends combination
{
    @Override
    public void operation()
    {
        Scanner sc=new Scanner(System.in);
        boolean condition;
        do{
            System.out.println("\b");
            System.out.println("====STIRLING NUMBER OF THE SECOND CASE====");
            System.out.println("This program accept numbers ranging from 1 to 500. ");            
            System.out.println("\b");
            System.out.print("Assign value for n: ");
            int n=sc.nextInt();
            System.out.print("Assign value for k: ");
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
                    if(n>=r)
                        {   
                            System.out.println("\b");
                            int i = r;
                            int p = 0;
                            System.out.println("S(" + n +  "," +r + ") = " + stirling(n,r,i,p));
                            
                        }
                    else
                        {
                        System.out.println("\b");
                        System.out.println("n should be greater than k!");
                        condition=false;
                        }
                                break;
                }
        }
        while(condition == false);
        
        
    }    
        public  BigInteger factorial(int number)
        {
           BigInteger factorialInt= BigInteger.ONE;
            
           for(int i=number;i>=1;i--)
            {
               factorialInt=factorialInt.multiply(BigInteger.valueOf(i));
            }
           return factorialInt;
           
        }
    public BigInteger JraisedToN(int n,int r,int i,int p)
        {
            BigInteger counter= BigInteger.valueOf(r).subtract(BigInteger.valueOf(p));
            BigInteger JtoN=counter;
            for(int q=1;q<=n-1;q++)
            {
            JtoN=JtoN.multiply(counter);    
            }

            return JtoN;
        }
    public BigInteger stirling(int n,int r,int i,int p)
    {   
        
        BigInteger final1 = BigInteger.ZERO;
        BigInteger oneRaised = BigInteger.valueOf(-1);
     for( p=0;p<=i-1;p++)
       { 
            BigInteger jCi=factorial(r).divide(factorial(r-p).multiply(factorial(p)));
            
            oneRaised=oneRaised.multiply(BigInteger.valueOf(-1));      
            
            BigInteger stirling =oneRaised.multiply(jCi).multiply(JraisedToN(n,r,i,p));
            
            final1=final1.add(stirling);           
            
                     
       }         
              return((final1).divide(factorial(r)));
              
    
    }
}
