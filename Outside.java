//class Outer8
//{
//	class Inner8{
//		public void m1(){
//		System.out.println("I AM FROM INNER CLASS");
//		}
//	}
//
//
//	
//}

class Outside{

	public static void main(String[] args)
	{
		Outer8 o = new Outer8();
		Outer8.Inner8 oi = o.new Inner8();
		oi.m1();
	}
}