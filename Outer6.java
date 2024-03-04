class Outer6
{
	class Inner6{
		public void m1(){System.out.println("I AM FROM INNER CLASS");}
	}
	public static void main(String[] args)
	{
		Outer6.Inner6 oi = new Outer6().new Inner6();
		oi.m1(); 

	}

}