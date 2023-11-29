// (((((10+2)+2)-2)*2)/2) //

package Package1;

public class Arithmeticass1 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is "+z);
		return z;
	}
	public int multi (int a1, int b1)
	{
		int c1;
		c1=a1*b1;
		System.out.println("multi result is "+c1);
		return c1;
	}
	public void div (int x1, int y1)
	{
		int z1;
		z1=x1/y1;
		System.out.println("Final result is "+z1);
	}
	public static void main (String args[])
	{
		Arithmeticass1 A= new Arithmeticass1();
		int sumresult1=A.sum(10,2);
		int sumresult2=A.sum(sumresult1,2);
		int subresult=A.sub(sumresult2,2);
		int multiresult=A.multi(subresult,2);
		A.div(multiresult,2);
	}
	
}

