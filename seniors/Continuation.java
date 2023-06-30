package seniors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Continuation {

	public static void main(String[] args) {
		String sentence = "my name is Ibrahim, my no is 08134312272";
		sentence = "08134312272";
		sentence += "09167237821 Ibrahim is my name, 09118754233";
		String format = "(\\+234|0)[7-9][01][0-9]{8}";

		Pattern pt = Pattern.compile(format);
		Matcher mt = pt.matcher(sentence);

		System.out.println("Match: " + mt.matches()); // Method 1 of printing the output
//	 System.out.println(Pattern.matches(sentence, format)); // Method 2 of printing the output
		System.out.println("Match: " + mt.find());
		int start = mt.start();
		int end = mt.end();
		System.out.println("Start index " + start); // start finds the position
		System.out.println("End index" + end);
		System.out.println(sentence.substring(start, end)); // substring = end index - 1
		System.out.println("Match value: " + mt.group());
	}
}
