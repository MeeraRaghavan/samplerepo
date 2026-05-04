package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age=10;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			// TODO Auto-generated method stub
		}
		else
		{
			throw new ArithmeticException("Enter age above 18");
		}
	}

}
