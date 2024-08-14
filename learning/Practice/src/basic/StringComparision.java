package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class StringComparision {

	public static void main(String[] args) {
		String a = "Vineesha";
		String b = "Vineesha";
		String c = a;

		System.out.println(a == b);
		System.out.println(c == a);
		String name1 = new String("Vineesha");
		String name2 = new String("Vineesha");
		String name3 = name1;
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		System.out.println(name3 == name1);
		System.out.println(name3.equals(name1));

		// PrettyPrinting
		float f = 432.466f;
		System.out.println(f);
		System.out.printf("Pritty Printing Float %.2f %n", f);
		System.out.printf("Pi Value %.3f %n", Math.PI);
		System.out.printf("My name is %s and I am doing my %s %n", "Vineesha", "Job");
		// this % is called placeholder and we can find placeholders list online

		// operators
		System.out.println('a' + 'b'); // char converted to numbers 97+98
		System.out.println("a" + "b"); // string not converted to numbers
		System.out.println('a' + 3); // type casting
		System.out.println((char) ('a' + 3));
		System.out.println("a" + 1);
		System.out.println("Vineesha" + new ArrayList<>());
		System.out.println("Vineesha" + new Integer(56));
		System.out.println(new Integer(56) + "" + new ArrayList<>());
		// atleast one of the element as to be primitive or String
		// Ex: new Integer(56) + new ArrayList<>() -- will not work

		// Performance
		String series = "";
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			System.out.println(ch);
		}
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			series = series + ch;
		} // here multiple strings are created (a, ab, abc, abcd, abcde, ....)
		System.out.println(series);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			sb.append((char) ('a' + i));
		}
		System.out.println(sb.reverse());

		// String Methods

		String name = "Vineesha Katta";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(" Vineesha   ".strip());
		System.out.println(Arrays.toString(name.split(" ")));

		// Palindrom
		String ele = "abcdcba".toLowerCase();
		System.out.println(isPalindrom(ele));

	}

	static boolean isPalindrom(String ele) {
		if (ele == null) {
			System.out.println("palindrom");
		}
		for (int i = 0; i <= ele.length() / 2; i++) {
			char start = ele.charAt(i);
			char end = ele.charAt(ele.length() - 1 - i);
			if (start != end) {
				return false;
			}
		}
		return true;

	}

}
