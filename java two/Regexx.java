package javatwo;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regexx {

	public static void main(String[] args) {
		// . + * ?
		// ? - 0 or 1 time
		// + - at least 1 time - 1 or more times
		// * - 0 or more times

//		Pattern pt = Pattern.compile("a*");
//		Matcher mt = pt.matcher("aab");
//		
//		boolean res = mt.matches();
//		System.out.println(res);

		// . - Any singular character
//		System.out.println(Pattern.matches(".", "aab"));
//		System.out.println(Pattern.matches(".", "a"));
//		System.out.println(Pattern.matches(".", "b"));
//		System.out.println(Pattern.matches(".", ""));
//		System.out.println(Pattern.matches(".", " "));

//		System.out.println(Pattern.matches("a.", "aab"));
//		System.out.println(Pattern.matches("a.", "ab"));
//		System.out.println(Pattern.matches("a.", "ba"));

//		System.out.println(Pattern.matches("[A-Z]", "A"));
//		System.out.println(Pattern.matches("[A-Z]", "1"));
//		System.out.println(Pattern.matches("[A-Z]", "a"));
//		System.out.println(Pattern.matches("[A-Z]", "AA"));		

//		System.out.println(Pattern.matches("[a-z]", "a"));
//		System.out.println(Pattern.matches("[a-z]", "b"));
//		System.out.println(Pattern.matches("[a-z]", "aa"));
//		System.out.println(Pattern.matches("[a-z]", "B"));

//		System.out.println(Pattern.matches("[0-9]", "5"));
//		System.out.println(Pattern.matches("[0-9]", "1"));
//		System.out.println(Pattern.matches("[0-9]", "e"));
//		System.out.println(Pattern.matches("[0-9]", "12"));

		// {a}, {a,}, {a, b}
//		System.out.println(Pattern.matches("[0-9]{2}", "1"));
//		System.out.println(Pattern.matches("[0-9]{2}", "13"));
//		System.out.println(Pattern.matches("[0-9]{2}", "135"));

//		System.out.println(Pattern.matches("[0-9]{2,}", "1"));
//		System.out.println(Pattern.matches("[0-9]{2,}", "13"));
//		System.out.println(Pattern.matches("[0-9]{2,}", "135"));

//		System.out.println(Pattern.matches("[0-9]{2,5}", "1"));
//		System.out.println(Pattern.matches("[0-9]{2,5}", "13"));
//		System.out.println(Pattern.matches("[0-9]{2,5}", "135"));
//		System.out.println(Pattern.matches("[0-9]{2,5}", "1354567"));
//		System.out.println(Pattern.matches("[0-9]{2,5}", "15768"));

		// any singular choice
//		System.out.println(Pattern.matches("[bcr]", "b"));
//		System.out.println(Pattern.matches("[bcr]", "c"));
//		System.out.println(Pattern.matches("[bcr]", "r"));
//		System.out.println(Pattern.matches("[bcr]", "t"));
//		System.out.println(Pattern.matches("[bcr]", "br"));

//		System.out.println(Pattern.matches("[bcr]at", "bat"));
//		System.out.println(Pattern.matches("[bcr]at", "cat"));
//		System.out.println(Pattern.matches("[bcr]at", "rat"));
//		System.out.println(Pattern.matches("[bcr]at", "batt"));
//		System.out.println(Pattern.matches("[bcr]at", "batat"));

		// 0[789][01][0-9]{8}
//		System.out.println(Pattern.matches("0[789][01][0-9]{8}", "08112345678"));

		// +
//		System.out.println(Pattern.matches("\\+", "+"));

		// +234[789][01][0-9]{8}
//		System.out.println(Pattern.matches("\\+234[789][01][0-9]{8}", "08112345678"));
//		System.out.println(Pattern.matches("\\+234[789][01][0-9]{8}", "+2348112345678"));
//		System.out.println(Pattern.matches("\\+234[789][01][0-9]{8}", "+2345112345678"));
//		System.out.println(Pattern.matches("\\+234[789][01][0-9]{8}", "+2348212345678"));

		// grouping regex
//		System.out.println(Pattern.matches("ab+", "abb"));
//		System.out.println(Pattern.matches("ab+", "ab"));
//		System.out.println(Pattern.matches("ab+", "abab"));

//		System.out.println(Pattern.matches("(ab)+", "abb"));
//		System.out.println(Pattern.matches("(ab)+", "ab"));
//		System.out.println(Pattern.matches("(ab)+", "abab"));

//		System.out.println(Pattern.matches("(\\+234|0)[789][01][0-9]{8}", "+2348212345678"));
//		System.out.println(Pattern.matches("(\\+234|0)[789][01][0-9]{8}", "+2348112345678"));
//		System.out.println(Pattern.matches("(\\+234|0)[789][01][0-9]{8}", "08112345678"));
//		System.out.println(Pattern.matches("(\\+234|0)[789][01][0-9]{8}", "0+2348112345678"));
//		System.out.println(Pattern.matches("(\\+234|0)[789][01][0-9]{8}", "+23408112345678"));

		// \d \s
//		System.out.println(Pattern.matches("\\d", "9.9"));
//		System.out.println(Pattern.matches("\\d", "90"));
//		System.out.println(Pattern.matches("\\d", "e"));
//		System.out.println(Pattern.matches("\\d", "-9"));
//		System.out.println(Pattern.matches("\\d", "9"));

//		System.out.println(Pattern.matches("\\s", "9"));
//		System.out.println(Pattern.matches("\\s", "e"));
//		System.out.println(Pattern.matches("\\s", " "));
//		System.out.println(Pattern.matches("\\s", ""));
//		System.out.println(Pattern.matches("\\s", "\n"));

		System.out.println(Pattern.matches("\\S", "9"));
		System.out.println(Pattern.matches("\\S", "e"));
		System.out.println(Pattern.matches("\\S", " "));
		System.out.println(Pattern.matches("\\S", ""));
		System.out.println(Pattern.matches("\\S", "\n"));

		// [a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)*

	}

}


