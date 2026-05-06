package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
	Set <String>a=new HashSet<String>();	// TODO Auto-generated method stub
a.add("Red");
a.add("yellow");
a.add("violet");
a.add("Green");
System.out.println(a);
Iterator i=a.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
i.remove();
System.out.println(a);
	}

}
