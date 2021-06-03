package TestRK;
import java.util.Scanner;
class Employee
{
String Emp_name;
int Emp_id;
String Address;
String Mail_id;
int Mobile_no;
void display()
       {
	System.out.println(Emp_name);
	System.out.println(Address);
	System.out.println(Emp_id);
	System.out.println(Mail_id);
	System.out.println(Mobile_no);
       }
}
class Programmer extends Employee
{  
 	int BP; 
	void display()
       {
   	 System.out.println(BP);
	 System.out.println("DA"+0.97*BP);
	 System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
       }
} 
class Team_Lead extends Employee
{  
 int BP; 

void display()
          {
  	  System.out.println(BP);
	 System.out.println("DA"+0.97*BP);
	 System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
           }
} 
class Assistant_Project_Manager extends Employee
{  
 int BP; 
void display()
         {
   	 System.out.println(BP);
 	System.out.println("DA"+0.97*BP);
	 System.out.println("HRA"+0.10*BP);
   	 System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
         }
} 
class Project_Manager extends Employee
{  
 int BP; 
void display()
        {  
   	 System.out.println(BP);
 	System.out.println("DA"+0.97*BP);
 	System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
          }
} 
class Inheritance
{ 
public static void main(String args[])
           {
   	 System.out.println("\n 1.Programmer\n2.Team_Leader\n3.Assistant_Project_Manager\n4.Poject_Manager");
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int ch=input.nextInt();
	 switch (ch) 
    {
         case 1:
              Employee e1=new Employee();
           Programmer p1=new Programmer();
           e1.Emp_name="JON";
           e1.Address="y-city";
           e1.Mail_id="jon@gmail.com";
           e1.Emp_id=567;
           e1.Mobile_no=2345678;
           p1.BP=15000;
           p1.display();
              e1.display();
              break;
         case 2:
           Employee e2=new Employee();
          Team_Lead p2=new Team_Lead();
           e2.Emp_name="SMITH";
           e2.Address="A-city";
           e2.Mail_id="smith@gmail.com";
           e2.Emp_id=123;
           e2.Mobile_no=987321;
           p2.BP=30000;
           p2.display();
              e2.display();
              break;
         case 3:
           Employee e3=new Employee();
           Assistant_Project_Manager p3=new Assistant_Project_Manager();
           e3.Emp_name="DENIES";
           e3.Address="B-city";
           e3.Mail_id="MAIN@gmail.com";
           e3.Emp_id=456;
           e3.Mobile_no=98710;
           p3.BP=30000;
           p3.display();
              e3.display();
              break;
         case 4:
           Employee e4=new Employee();
           Project_Manager p4=new Project_Manager();
           e4.Emp_name="KANNAN";
           e4.Address="TRICHY";
           e4.Mail_id="tri@gmail.com";
           e4.Emp_id=789;
           e4.Mobile_no=9810;
           p4.BP=30000;
           p4.display();
              e4.display();
              break;
         case 5:
           //exit(1);
         
         default: 
          System.out.println("enter correct choice");
   
      } 
}
}
