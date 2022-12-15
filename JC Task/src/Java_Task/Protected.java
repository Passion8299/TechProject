package Java_Task;

public class Protected {

	protected int a=10;
	protected String s="JAVA";
	
	protected void m1() 
	{
		System.out.println(a);
		System.out.println(s);
	} 
	
	
	public static void main(String[] args) 
	{
		Protected p = new Protected();
		p.m1();
	}
}
