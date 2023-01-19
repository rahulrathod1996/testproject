package hello;

public class Animal {
	int legs=4;
	int eyes=2;
	boolean has_Tail;
	
	public void run()
	{
	System.out.println("i am runnig");
	}
	public void eat_veg()
	{
		System.out.println("i am eating veg food");
	}
	
	public void eat_nonveg()
	{
		System.out.println(" i am eating non veg food");
	}
	public static void sleep()
	{
		System.out.println("i am sleeping");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog=new Animal();//veg
		Animal tiger=new Animal();// non veg
		Animal lion=new Animal();//no
		Animal cat=new Animal();
		Animal bear=new Animal();
		
		
		//lion.run();
		//dog.eat_veg();
		//lion.eat_nonveg();
		//bear.has_Tail=false;
		System.out.println("Tail for bear is "+bear.legs);
		
		//cat.has_Tail=true;
		//System.out.println("Tail for cat is "+ cat.has_Tail);
		//sleep();

		
	}

}
