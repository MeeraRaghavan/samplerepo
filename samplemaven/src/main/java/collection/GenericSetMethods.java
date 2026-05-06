package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
	Set <String> a=new HashSet <String>();	// TODO Auto-generated method stub
a.add("Apple");
a.add("Orange");
a.add("Banana");
System.out.println(a);
Set <String> b=new HashSet <String>();
b.add("Grapes");
b.add("Watermelon");
a.addAll(b);
System.out.println(a);
System.out.println(a.contains("Banana"));
System.out.println(a.containsAll(b));
System.out.println(b.containsAll(a));
System.out.println(a.isEmpty()); 
a.remove("Banana");
System.out.println(a);
a.removeAll(b);
System.out.println(a);
a.clear();
System.out.println(a);
}

}
