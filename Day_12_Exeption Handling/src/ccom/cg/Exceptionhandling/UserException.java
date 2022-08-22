package ccom.cg.Exceptionhandling;
class CustomException extends Exception
{
	private int detail;
	//parameterized constructor
	public CustomException(int detail) {
		super();
		this.detail = detail;
	}
	public CustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomException [detail=" + detail + "]";
	}
	
}
public class UserException {
	static void accept(int a)throws CustomException
	{
		System.out.println("called compute ");
		if(a>10)
			throw new CustomException(a);
		System.out.println("no exception");
		
	}

	public static void main(String[] args) {
		try
		{
		accept(9);
		}
		catch(CustomException e1)
		{
			System.out.println("ashutosh"+e1);
		}
	}

}
