package OOps_polymorphism;

class sample
{
	void get(int x)
	{
		System.out.println("The value of X  is :"+x);
	}
	
	
	void get()
	{
		System.out.println("This is default :");
	}
	
	void get(String name)
	{
		System.out.println("CHange the parameters :"+name);
	}
}

public class Compile_time_Plumorphism_Static 
{

	public static void main(String[] args) 
	{

		sample s= new sample();
		s.get(5);
		s.get("java");
		s.get();
	}

}
