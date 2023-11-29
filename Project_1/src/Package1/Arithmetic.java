// (12+2)(12-2)- Program to execute it as below;
package Package1;

public class Arithmetic 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c; //return keyword is mandatory for non void method
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Sub result is "+z);
		return z;
	}
	public void mul(int a1,int b2)
	{
		int c3;
		c3=a1*b2;
		System.out.println("Final result is "+c3);
	}
	public static void main(String[]args)
	{
	Arithmetic re=new Arithmetic();
	int sumresult=re.sum(12,2);
	int subresult=re.sub(12,2);
	re.mul(sumresult, subresult);
	
	}

}
