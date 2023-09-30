package selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class It {

	public static void main(String[] args) {

		ArrayList<String>cars=new ArrayList<String>();

		cars.add("bmw");
		cars.add("audi");
		cars.add("maruti");
		cars.add("kia");

		Iterator<String> it=cars.iterator();

		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

	}

}
