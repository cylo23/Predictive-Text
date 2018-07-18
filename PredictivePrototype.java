package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PredictivePrototype {

	public static String wordToSignature(String word) {

		StringBuffer str = new StringBuffer("");
		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++) {

			int numericalValue = Character.getNumericValue(word.charAt(i));
			int value = 0;

			if (numericalValue >= 10 && numericalValue <= 12) {
				value = 2;
			}

			if (numericalValue >= 13 && numericalValue <= 15) {
				value = 3;
			}

			if (numericalValue >= 16 && numericalValue <= 18) {
				value = 4;
			}

			if (numericalValue >= 19 && numericalValue <= 21) {
				value = 5;
			}

			if (numericalValue >= 22 && numericalValue <= 24) {
				value = 6;
			}

			if (numericalValue >= 25 && numericalValue <= 28) {
				value = 7;
			}

			if (numericalValue >= 29 && numericalValue <= 31) {
				value = 8;
			}

			if (numericalValue >= 32 && numericalValue <= 35) {
				value = 9;
			}

			else if (numericalValue == -1) {
				str.append(" ");

			}

			str.append(value);

		}

		return str.toString();

	}

	public static Set<String> signatureToWords(String signature) {

		HashSet<String> match = new HashSet<String>();

		File textFile = new File("C:\\Users\\Jo\\Desktop\\words.txt");
		
//		File textFile = new File();

		Scanner input = null;
		try {
			input = new Scanner(textFile);

			while (input.hasNextLine()) {

				String line = input.nextLine();

				if (line.length() == signature.length() && isValidWord(line) == true) {
					
					if (wordToSignature(line).equals(signature)) {

						match.add(line.toLowerCase());

					}

				}

			}
			
			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");

			e.printStackTrace();
		}

		return match;

	}

	private static boolean isValidWord(String word) {


		for (int i = 0; i < word.length(); i++) {

			if (Character.getNumericValue(word.charAt(i)) >= 10 && Character.getNumericValue(word.charAt(i)) <= 35) {

			return true;
			
			}

		}

		return false;
	}
	
//	public static void main(String[] args) {
//		
//		System.out.println(wordToSignature("jd"));
//
//		System.out.println(signatureToWords("43556"));
//		
//		
//	}

		
	
	
	

}
