package page;

import java.util.Arrays;

public class AngryProfessor {
	
	public static void main(String[] args) { 
		attendance("8 7","9 2 9 7");
		attendance("8 7","9 7 0 1");
	}
	
		static void attendance (String line1, String line2) {
		String[] line1_numbers = line1.split("");
		int N = Integer.parseInt(line1_numbers[0]);
		int K = Integer.parseInt(line1_numbers[1]);
		String[] line2_numbers = line2.split("");
		
		if (K > N) {
			System.err.println("N can not be greater than K");
			return;
		}
		
		if (line2_numbers.length > N) {
			System.err.println("line2_numbers.length can not be greater than N");
			return;
		}
		int early = 0;
		
		for (int i = 0; i < line2_numbers.length; i++) {
			int time = Integer.parseInt(line2_numbers[i]);
			if (time <= 0)
				early++;
		}
		early = 0;
		
		for (String num : line2_numbers) {
			int time = Integer.parseInt(num);
			if (time <= 0)
				early++;
		}
		
//		if (K > early)
		System.out.println(K > early ? "YES" : "NO");
	}
}
