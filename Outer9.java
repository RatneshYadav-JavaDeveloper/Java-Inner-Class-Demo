class Outer9{
	//instance variable of Outer9 class
	int x = 10;
	//static variable of Outer9 class
	static int y = 100;
	class Inner9
	{
		//instance variable of Inner class 9 [NOTE : You can't static declarations in Inner call areas]
		//but you can access static variable from Inner class areas
		int x = 100;
		public void m1(){
			//local variable of m1() method
			int x = 1000;
		
			System.out.println("I AM m1 METHOD LOCAL VARIABLE : "+x);
			System.out.println("I AM INNER CLASS INSTANCE VARIABLE : "+this.x);
			System.out.println("I AM OUTER CLASS INSTANCE VARIABLE : "+Outer9.this.x);
			System.out.println("I AM OUTER CLASS STATIC VARIABLE : "+Outer9.y);
			
			
		}
		
		
		
	}

	public static void main(String[] args)
	{
	

		Outer9 o = new Outer9();
		Outer9.Inner9 oi = o.new Inner9();
		oi.m1();
	}
}