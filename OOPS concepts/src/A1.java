public class A1 {
	void displayA() 
	{  System.out.println("class A1"); 
	} } class B extends A1 { 
		void displayB()  { 
			System.out.println("class B");  } }
	class C extends B {
		void displayC()  { 
			System.out.println("Class C");  } 
		public static void main(String[] args)     
		{        C ob=new C();       
		ob.displayA();//Grandparent class    
		ob.displayB();//Parent class 
		ob.displayC();//local method of Class C  } } 
	}
	}