//Inspired by FizzBuzz: One Simple Interview Question | Tom Scott | https://www.youtube.com/watch?v=QPZ0pIK_wsc
package fizz.buzz;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzMain {

	// My first try before watching the video
	public void runBodge() {
		String fizz = "Fizz";
		String buzz = "Buzz";

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(fizz + buzz);
			} else if (i % 3 == 0) {
				System.out.println(fizz);
			} else if (i % 5 == 0) {
				System.out.println(buzz);
			} else {
				System.out.println(i);
			}
		}
	}

	// My better formated future proofed one made after watching the video
	public void runClean() {
		ArrayList<?> keywords = new ArrayList<String>(Arrays.asList("fizz", "buzz"));
		ArrayList<?> checks = new ArrayList<Integer>(Arrays.asList(3, 5));
		int iterations = 100;
		String output = "";

		if (keywords.size() != checks.size()) {
			System.err.println("Must have the same number of keywords and checks");
			System.err.println("Keywords: " + keywords.size());
			System.err.println(keywords.toString());
			System.err.println("Checks: " + checks.size());
			System.err.println(checks.toString());
			return;
		}

		for (int i = 1; i <= iterations; i++) {
			output = "";
			for (int j = 0; j < keywords.size(); j++) {
				if (i % (int) checks.get(j) == 0) {
					output += keywords.get(j);
				}
			}

			if (output == "") {
				output = "" + i;
			}

			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		new FizzBuzzMain().runClean();
	}
}