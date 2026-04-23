package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	public void show()
	{
		System.out.println("This is Super method child");
		super.display();
	}
	

	public static void main(String[] args) {
		SuperMethodChild obj = new SuperMethodChild();
		obj.show();// TODO Auto-generated method stub

	}

}
