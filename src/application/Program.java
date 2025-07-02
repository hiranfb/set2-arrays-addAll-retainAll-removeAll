package application;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// Union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("C = " + c);

		// Intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("D = " + d);

		// Difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("E = " + e);
	}
}