package javatwo;

import java.text.NumberFormat;
import java.util.Locale;

public class Simple6 {

	public static void main(String[] args) {

//		Locale locale = new Locale("ng", "NG");
//		NumberFormat nf = NumberFormat.getCurrencyInstance();
//		System.out.println(nf.format(1234567890));
//		
//		nf = NumberFormat.getCurrencyInstance(locale);
//		System.out.println(nf.format(1234567890));

		Locale[] lc = Locale.getAvailableLocales();
		for (Locale l : lc) {
			if (l.getLanguage().equals("ng")) {
				System.out.print("Language: " + l.getLanguage());
				System.out.println("\tCountry: " + l.getCountry());
			}
		}

	}

}

