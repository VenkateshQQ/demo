package practise;

public class TestConstructor {
	static int x;
	int y=20;
	int m;
	int n;
	TestConstructor(){
		System.out.println("***Non-parameterized Constructor***");
	}
	TestConstructor(int a, int b){
		System.out.println("***Parameterized Constructor***");
		m=a;
		n=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x=30;
		
		TestConstructor tc1=new TestConstructor(50, 60);
		TestConstructor tc=new TestConstructor();
		tc.y=40;
		System.out.println("x Value: "+x);
		System.out.println("y Value: "+tc.y);
		System.out.println("m Value: "+tc1.m);
		System.out.println("n value: "+tc1.n);
	}

}
