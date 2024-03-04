class Outer5
{

	class Inner5{
		public void m1(){
			System.out.println(" I AM FROM INNER CLASS");
		}
	}

	public static void main(String[] args)
	{
		//creating outer class object
		Outer5 o = new Outer5();
		//creating Inner object
		Outer5.Inner5 oi = o.new Inner5();
		oi.m1();
	
	}

}