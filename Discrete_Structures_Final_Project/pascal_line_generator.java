
package Discrete_Structures_Final_Project;

import java.util.Scanner;
import java.math.BigInteger;

public class pascal_line_generator extends stirling
{
    @Override
    public void operation()
    {
        System.out.println("\b");
        Scanner sc = new Scanner (System.in); 
        System.out.println("====PASCAL'S TRIANGLE LINE GENERATOR====");
        System.out.println("This program accept numbers ranging from 1 to 500. ");
        System.out.println("\b");
        System.out.print("Enter a number to generate a line from Pascal's triangle: ");
        int r=sc.nextInt();        
        int n;
        
       if(r>500 || r<1)
        {
            System.out.println("\b");
            System.out.println("The number you entered is out of range!");
        }
        else
        {
         for (n=r;n<=r;n++)
            {
                BigInteger nCk = BigInteger.ONE;
                for (int k=0;k<=n;k++)
                {
                    
                    System.out.print(nCk+ " ");
                    nCk = nCk.multiply(BigInteger.valueOf(n-k)).divide(BigInteger.valueOf(k+1));
                }
                System.out.println("\b");

            }
        }
        
        
                    
        
        
               
                
    }
}
