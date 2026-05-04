package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age=10;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			// TODO Auto-generated method stub
		}
		else
		{
			throw new AgeException("Enter age above 18");
		}
	}

}
