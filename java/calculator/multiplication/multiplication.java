package multiplication;
import java.io.*;
public class multiplication
{	
	int sum=0,i=0;
	
	public int mult()
	{

		DataInputStream dis= new DataInputStream(System.in);
		try
		{		
			
			System.out.println("Enter the number of numbers you want to calculate: ");
			int n=Integer.parseInt(dis.readLine());
			int x[]=new int[n];
			for(int i=0;i<=n;i++)
			{	
				System.out.println("Enter first number: ");
				 x[i]= Integer.parseInt(dis.readLine());
				sum=sum*x[i];
			}
		  
		}
		catch(Exception e)
		{}
		return (sum);	
	}	
} 