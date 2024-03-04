class Outer2
{
	class Inner2{
	 
	//when you run with inner class -> java Outer$Inner -> throws Exception [D:\CORE_JAVA\INNER_CLASS_1.2V>java Outer$Inner
	//Error: Main method not found in class Outer$Inner, please define the main method as:
   	//public static void main(String[] args)
	//or a JavaFX application class must extend javafx.application.Application ]
	}

	public static void main(String[] args)
	{
		System.out.println("I AM FROM OUTER CLASS");
	}
}
