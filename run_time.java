package OOps_polymorphism;

class one
{
	void show(int x)
	{
		System.out.println("This is the run time polhymorphism  one :");
	}
}

class two extends one
{
	void show()
	{
		System.out.println("This is the run time polhymorphism two :");
	}
}


public class Run_time_overriding 
{

	public static void main(String[] args) 
	{
		
		one o = new one();
		two t = new two();
		t.show();
		o.show(45);


	}

}
