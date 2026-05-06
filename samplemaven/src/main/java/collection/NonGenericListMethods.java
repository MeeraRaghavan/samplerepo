package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List a =new ArrayList();
	a.add("5");
	a.add("Red");
	a.add("M");
	a.add("2.5f");
	a.add("5");
	System.out.println(a);// TODO Auto-generated method stub
System.out.println(a.get(2));
a.set(1, "Hello");
System.out.println(a);
System.out.println(a.indexOf("5"));
System.out.println(a.lastIndexOf("5"));
a.remove(2);
System.out.println(a);
System.out.println(a.contains("Red"));
System.out.println(a.isEmpty());
System.out.println(a.size());
	}

}
