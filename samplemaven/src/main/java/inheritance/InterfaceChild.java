package inheritance;

public class InterfaceChild implements InterfaceParent1,InterfaceParent2{
	public void display()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
	InterfaceChild obj = new InterfaceChild();
	obj.print();
	obj.show();
	obj.display();// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		System.out.println("Hello World");// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
	System.out.println("Hai Hello");	// TODO Auto-generated method stub
		
	}

}
