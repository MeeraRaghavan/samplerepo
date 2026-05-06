package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> L=new ArrayList<String>();
L.add("Green");
L.add("Red");
L.add("Blue");
L.add("Green");
L.add("Black");
L.add("Green");
System.out.println(L);
System.out.println(L.get(2));
L.set(2, "White");
System.out.println(L);
System.out.println(L.indexOf("Red"));
System.out.println(L.lastIndexOf("Black"));
L.remove(1);
System.out.println(L);
L.remove("Red");
System.out.println(L);
System.out.println(L.contains("Blue"));
System.out.println(L.isEmpty());
System.out.println(L.size());
	}
}
