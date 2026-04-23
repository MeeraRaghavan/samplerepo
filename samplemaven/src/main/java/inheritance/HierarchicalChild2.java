package inheritance;

public class HierarchicalChild2 extends HierarchicalParent {
	public static void show()
	{
		System.out.println("This is child2");
	}

	public static void main(String[] args) {
		HierarchicalChild2 obj = new HierarchicalChild2();
		obj.display();
		obj.show();// TODO Auto-generated method stub

	}

}
