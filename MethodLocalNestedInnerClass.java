class MethodLocalNestedInnerClass
{
	//instance method of MethodLocalNestedInnerClass class
	public void m1()
	{
		//created nested inner class inside instance method of MethodLocalNestedInnerClass class
		class Inner{
			public void sum(int a , int b)
			{
				System.out.println("The Sum is : "+(a+b));
			}
		
		}

		Inner i = new Inner();
		i.sum(50,60);
	}

	public static void main(String[] args)
	{
		MethodLocalNestedInnerClass m = new MethodLocalNestedInnerClass();
		m.m1();	
	}

}