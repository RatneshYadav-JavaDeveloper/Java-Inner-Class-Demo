//Outer class
class NestedInnerClass
{
	//first inner class
	class FirstInner
	{
		//nested iner class
		class SecondInner
		{

			public void m1()
			{
				System.out.println("I AM FROM NESTED INNER CLASS");
			}
		}
	}

	public static void main(String[] args)
	{
		NestedInnerClass o = new NestedInnerClass();
		NestedInnerClass.FirstInner f = o.new FirstInner();
		NestedInnerClass.FirstInner.SecondInner s = f.new SecondInner();
		s.m1();

	}
}