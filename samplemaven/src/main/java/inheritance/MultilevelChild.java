package inheritance;

public class MultilevelChild extends MultilevelParent {
	public void show()
	{
		System.out.println("This is Child");
	}

	public static void main(String[] args) {
	MultilevelChild obj=new MultilevelChild();
	obj.display();
	obj.print();
	obj.show();// TODO Auto-generated method stub

	}

}
