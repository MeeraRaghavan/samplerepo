package interfaceexample;

public class Interface2 implements Interface1{
public void show()
{
	System.out.println("Hello");
}
	public static void main(String[] args) {
	Interface2 obj=new Interface2();
	obj.display();
	obj.print();
	obj.show();
	//reference creation
	Interface1 obj1=new Interface2();
	obj1.display();
	obj1.print();

	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("HI");
	}
	@Override
	public void print() {
		System.out.println("Hello World");// TODO Auto-generated method stub
		
	}

}
