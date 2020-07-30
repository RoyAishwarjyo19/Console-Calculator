import java.lang.Math; 
import java.io.File;
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;

public class cmdcalc extends FileIO implements Icmdcalc 
{
	public double x;
	public double y;
    private double RESULT;
	
	public double add(double x)
	{
		System.out.println("Cannot perform addition");
		return 0.0;
	}
	
	public double sub(double x)
	{
		System.out.println("Cannot perform subtraction");
		return 0.0;
	}
	
	public double mul(double x)
	{
		System.out.println("Cannot perform multiplication");
		return 0.0;
	}
	
	public double div(double x)
	{
		System.out.println("Cannot perform division");
		return 0.0;
	}
	
	public double log(double x)
	{
		this.x = x;
		RESULT = Math.log10(this.x);
		return RESULT;
	}
	
	public double power(double x)
	{
		System.out.println("Cannot perform power");
		return 0.0;
	}
	
    public double add(double x, double y)
	{
		this.x = x;
		this.y = y;
		RESULT = this.x+this.y;
		return RESULT;
	}
	
	public double sub(double x, double y)
	{
		this.x = x;
		this.y = y;
		RESULT = this.x-this.y;
		return RESULT;
	}
	
	public double mul(double x, double y)
	{
		this.x = x;
		this.y = y;
		RESULT = this.x*this.y;
		return RESULT;
	}
	
	public double div(double x, double y)
	{
		this.x = x;
		this.y = y;
		RESULT = this.x/this.y;
		return RESULT;
	}
	
	
	public double log(double x, double y)
	{
		this.x = x;
		this.y = y;
		RESULT = Math.log10(this.x);
		return RESULT;
	}
	
	public double power(double x, double y)
	{
		this.x = x;
		this.y = y;
		RESULT = this.x;
		for(int i=0;i<y-1;i++)
		{
			RESULT = RESULT*this.x;
		}
		return RESULT;
		
	}
	
	public static void main(String args[]){
		cmdcalc obj = new cmdcalc();
		System.out.println("***Welcome to CMD calculator!***");
		while(true)                                             //infinite while loop started to take inputs as many times as user wishes
		{
			double x, y;                                        //variables to hold the two inputs
			
			System.out.print("\nWhat operation would you like to perform on them?\nPress the following buttons for the operations\naddition = a\nsubtraction = s\nnmultiplication = m\ndivision = d\npower = p\nlog = l\n\nEnter a character: ");
			
			Scanner S = new Scanner(System.in);                 //Scanner object declared
			char c = S.next().charAt(0);                        //takes input via character for the specific action performed for the two numbers
			
			FileIO Fobj = new FileIO();
			
			if(c == 'a')                                        //for addition
			{
				System.out.print("Please enter two numbers: ");
				x = S.nextDouble();                                 //input value 1 taken
			    y = S.nextDouble();                                 //input value 2 taken
				
				double result = obj.add(x, y);                  //double value, result is assigned to the value returned by the add method
				
				Fobj.FileW(result);                             //Writes to File
				
				System.out.print("Result: ");
				Fobj.FileR();                                   //Reads from File
			} 
			
			else if(c == 's')                                        //for subtraction
			{
				System.out.print("Please enter two numbers: ");
				x = S.nextDouble();                                 //input value 1 taken
			    y = S.nextDouble();                                 //input value 2 taken
				
				double result = obj.sub(x, y);                  //double value, result is assigned to the value returned by the add method
				
				Fobj.FileW(result);                             //Writes to File
				
				System.out.print("Result: ");
				Fobj.FileR();                                   //Reads from File
			} 
			
			else if(c == 'm')                                        //for multiplication
			{
				System.out.print("Please enter two numbers: ");
				x = S.nextDouble();                                 //input value 1 taken
			    y = S.nextDouble();                                 //input value 2 taken
				
				double result = obj.mul(x, y);                  //double value, result is assigned to the value returned by the add method
				
				Fobj.FileW(result);                             //Writes to File
				
				System.out.print("Result: ");
				Fobj.FileR();                                   //Reads from File
			}
			
			else if(c == 'd')                                        //for division
			{
				System.out.print("Please enter two numbers: ");
				x = S.nextDouble();                                 //input value 1 taken
			    y = S.nextDouble();                                 //input value 2 taken
				
				if(y == 0.0)                                                       //This is to check if the second input is 0, if it is, it cannot be divided
				{
					System.out.println("Cannot divide by 0");
				}
				else{                                                              //Otherwise, do the usual
					double result = obj.div(x, y);                  //double value, result is assigned to the value returned by the add method
					
					Fobj.FileW(result);                             //Writes to File
					
					System.out.print("Result: ");
					Fobj.FileR();                                   //Reads from File
				}
			}
			
			else if(c == 'p')                                        //for power
			{
				System.out.print("Please enter two numbers: ");
				x = S.nextDouble();                                 //input value 1 taken
			    y = S.nextDouble();                                 //input value 2 taken
				
				double result = obj.power(x, y);                  //double value, result is assigned to the value returned by the add method
				
				Fobj.FileW(result);                             //Writes to File
				
				System.out.print("Result: ");
				Fobj.FileR();                                   //Reads from File
			}
			
			else if(c == 'l')                                        //for logarithm
			{
				System.out.print("Please enter a number: ");
				x = S.nextDouble();                                 //input value 1 taken
				
				double result = obj.log(x);                  //double value, result is assigned to the value returned by the add method
				
				Fobj.FileW(result);                             //Writes to File
				
				System.out.print("Result: ");
				Fobj.FileR();                                   //Reads from File
			}
			
			System.out.println("Would you like to perform another operation? (Y/N): ");
			c = S.next().charAt(0);
			if(c == 'Y')
			{
				continue;
			}
			else if(c == 'N')
			{
				break;
			}
		}
		System.exit(0);
	} 
}