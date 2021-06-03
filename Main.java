package TestRK;
import java.util.*;
public class Main
{
            public static void main(String args[])
            {
                        Scanner scr=new Scanner(System.in);
                        int array[] = {20,30,40,50,60};
                        int num1,num2,q;
                        try 
                        {
                                    System.out.println("\nEnter the value of first integer : ");
                                    num1=Integer.parseInt(scr.next());
                                    System.out.println("\nEnter the value of second integer : ");
                                    num2=Integer.parseInt(scr.next());
                                    q=num1/num2;
                                    System.out.println("\nQuotient is : "+q);
                                    for (int i=0; i<=6; i++)
                                    {
                                        System.out.println("The value of the array is: "+array[i]);
                                    }
                        }
                        catch(NumberFormatException e)
                        {
                                    System.out.println(e);
                        }
                        catch(ArithmeticException e)
                        {
                                    System.out.println(e);
                        }
                    }
                }
