import java.io.*;
class rational
{
	int num,den,r;
	void setdata()
	{
		DataInputStream dis=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the Denominator");
			num=Integer.parseInt(dis.readLine());
			System.out.println("Enter the Numerator");
			den=Integer.parseInt(dis.readLine());
		}
		catch(Exception e)
		{}
	}
	boolean is_equal(rational r)
	{
		if((num==r.num)&&(den==r.den))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	rational add(rational r)
	{
		r.num=(num*r.den)+(r.num*den);
		r.den=(den*r.den);
		return r;
 
	}
	rational div()
	{
		r.num=(num*r.den);
		r.den=(den*r.num);
		return r;
	}
	void display()
	{
		
	}
	public static void main(String args[])
	{
		rational r1=new rational();
		rational r2=new rational();
		r1.setdata();
		r2.setdata();
		rational r= new rational();
		r=r1.div(r2);
		System.out.println("Division of 2 rationals is");
		r.show();
		boolean b=r1.is_equal(r2);
		if(b==true)
		System.out.println("Both are Equal numbers");
		else
		System.out.println("Both are Unequal");
		r=r1.add(r2);
		System.out.println("Addition of two rationals is:");
		r2.show();
	}
} 