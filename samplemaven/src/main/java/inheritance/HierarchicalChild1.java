package inheritance;

public class HierarchicalChild1 extends HierarchicalParent {
	public void print()
	{
		System.out.println("This is child1");
	}

	public static void main(String[] args) {
		HierarchicalChild1 obj=new HierarchicalChild1();
		obj.display();
		obj.print();// TODO Auto-generated method stub

	}

}