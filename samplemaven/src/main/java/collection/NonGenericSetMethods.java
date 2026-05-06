package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set a=new HashSet();
a.add("A");
a.add("HELLO");
a.add("25.5F");
Set b=new HashSet();
b.add("10");
b.add("HI");
a.addAll(b);
System.out.println(a);
System.out.println(a.contains("HELLO"));
System.out.println(a.containsAll(b));
System.out.println(a.isEmpty());
a.remove("A");
System.out.println(a);
a.removeAll(b);
System.out.println(a);
a.clear();
System.out.println(a);
System.out.println(b.size());
	}

}
