/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discrete_Structures_Final_Project;

import java.util.Scanner;

public class user_Choice extends pascal_line_generator
        
{
  public void choices()
  {
        Scanner sc=new Scanner(System.in);
        int ans1;
        Boolean verify;
        String ans2; 
        
        
        do
        {
           
                    verify=true;
                    permutation obj = new permutation ();
                    System.out.println("\b");
                    System.out.println("1 ) Permutation");
                    System.out.println("2 ) Combination");
                    System.out.println("3 ) Stirling number of second case");
                    System.out.println("4 ) Pascal's Triangle line generator");
                    System.out.print("Please select operation: ");
                    ans1=sc.nextInt();
                    switch (ans1)
                        {
                            case 1:
                                obj.operation();
                                break;
                            case 2:
                                permutation obj2 = new combination();
                                obj2.operation();
                                break;
                            case 3:
                                permutation obj3 = new stirling();
                                obj3.operation();
                                break;
                            case 4:
                                permutation obj4 = new pascal_line_generator();
                                obj4.operation();
                                break;
                            default:
                                System.out.println("\b");
                                System.out.println("There is no specific operation for that number! ");  
                                
                        }
                    System.out.println("\b");
                    boolean verify2=true;
                    do
                    {
                        System.out.println("\b"); 
                        System.out.print("Do you want to try another calculation? y/n:");
                        ans2 = sc.next();
                        if(ans2.equalsIgnoreCase("y"))
                        {
                            verify=true;
                            verify2=true;
                        }
                        else if(ans2.equalsIgnoreCase("n"))
                        {                        
                            System.out.println("Thank you!");  
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("\b"); 
                            System.out.println("Invalid!");
                            verify2=false;
                        }
                    }
                    while(verify2!=true);
                    
                       
                               
        
        }
        while (verify!=false);
            System.out.println("\b");
            
  }
}
