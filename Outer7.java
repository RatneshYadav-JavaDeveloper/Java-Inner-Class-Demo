class Outer7
{
	class Inner7{
		public void m1(){System.out.println("I AM FROM INNER CLASS");}
	}

	//instance method of outer class
	public void m2()
	{
		System.out.println("I AM FROM OUTER CLASS");
		//2-> so, you can create inner object and call inner method directly in this area
		Inner7 i = new Inner7();
		i.m1();
	}

	public static void main(String[] args)
	{
		//1> here existing of outer objects
		Outer7 o = new Outer7();
		o.m2();
	}
}