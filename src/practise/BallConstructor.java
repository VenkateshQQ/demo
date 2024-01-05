package practise;

public class BallConstructor 
{
	static int x;
	int y=20;
	int m;
	int n;
	BallConstructor()
	{
		System.out.println("non parameterized consructor");
	}
	BallConstructor(int a,int b)
	{
		System.out.println("parameterized constructor");
		m=a;
		n=b;
	}
	public static void main(String args[])
	{
		x=30;
		BallConstructor v=new BallConstructor();
		BallConstructor v1=new BallConstructor(50,60);
		v.y=40;
		System.out.println("x value"+x);
		System.out.println("y value"+v.y);
		System.out.println("m value"+v1.m);
		System.out.println("n value"+v1.n);
		
	}
	
	
	
}
