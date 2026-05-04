package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=10;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			// TODO Auto-generated method stub
		}
		else
		{
			throw new VotingException("Enter age above 18");
		}
	}

}
