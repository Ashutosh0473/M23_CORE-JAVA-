package ccom.cg.Exceptionhandling;

public class ThrowDemo {

	public static void disp(int age ,int weight)throws Exception {
		if(age>18 && weight>45)
			System.out.println("Eligible to donate the blood");
		else
		{
			throw new ArithmeticException("Exception caught");
			
		}
	}
		public static void main(String args[]) throws Exception
		{
			try
			{
				disp(15,34);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		

	}

}
