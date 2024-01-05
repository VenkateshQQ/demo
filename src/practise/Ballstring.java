package practise;

public class Ballstring
{

	public static void main(String[] args)
	{
		String a="welcome venkatesh venkatesh";
		String b="hello";
		String c="world";
				System.out.println(a.length());
				System.out.println(a.charAt(5));
				System.out.println(a.toUpperCase());
				System.out.println(a.toLowerCase());
				System.out.println(a.lastIndexOf("e"));
				System.out.println(a.indexOf("e"));
				System.out.println(a.lastIndexOf("venkatesh"));
				System.out.println(a.indexOf("venkatesh"));
				System.out.println(a.endsWith("h"));
				System.out.println(a.startsWith("w"));
				System.out.println(a.replace('w', 'm'));
				System.out.println(a.replace("welcome","ball"));
				System.out.println(a.replaceAll("e", "a"));
				System.out.println(b.concat(c));
				System.out.println(b.concat("ball"));
				
				
				
		

	}

}
