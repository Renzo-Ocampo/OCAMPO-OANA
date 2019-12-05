
package Discrete_Structures_Final_Project;
import java.util.*;

public class main 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean validation;
        user_Choice obj = new user_Choice();
        do{
            try
                {
                    validation = true;
                    obj.choices();
                }

            catch(InputMismatchException e)
                {
                    System.out.println("\b");
                    System.out.println("Invalid input!");

                    validation =false;
                    boolean validation2=true;
                    do
                    {
                    System.out.println("\b"); 
                    System.out.print("Do you want to try another one? y/n :");
                    String ans = sc.next();
                    
                    if(ans.equalsIgnoreCase("y"))
                        {
                            
                            validation=true;
                            validation2=true;
                        }
                    else if(ans.equalsIgnoreCase("n"))
                        {
                            System.out.println("\b");                           
                            System.out.println("Thank you!");
                            System.exit(0);
                        }
                    else
                        {
                            System.out.println("\b"); 
                            System.out.println("Invalid!");
                            validation2=false;
                        }
                    }
                    while(validation2!=true);

                }
        }
        while(validation!=false);
        
                

    }
    
}
