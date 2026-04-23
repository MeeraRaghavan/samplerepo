package superkeyword;

public class SuperVariableChild extends SuperVariableParent{
String colour = "Black";
public void print()
{
	System.out.println(colour);
	System.out.println(super.colour);
}
	public static void main(String[] args) {
		SuperVariableChild obj = new SuperVariableChild();
		obj.print();// TODO Auto-generated method stub

	}

}
