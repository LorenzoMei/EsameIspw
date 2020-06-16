package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringIspw {

	public static void main(String[] args) {
		String[] string = new String[2];
				
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(input);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Inserisci la stringa numero " + i + "\n");
			try {
				string[i] = buffer.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		String resultConc = conc(string[0], string[1], "-");
		String resultFormat = format(resultConc, resultConc.length());
		String[] resultSplit = split(resultConc, "-");
		System.out.println("Stringhe concatenate: " + resultConc);
		System.out.println("Stringa formattata: " + resultFormat);
		
		for(int i = 0; i < resultSplit.length; i++) {
			System.out.println("String " + i + ": " + resultSplit[i]);
		}
		
	}
	
	public static String conc(String stringOne, String stringTwo, String delimiter) {
		String string = String.join(delimiter, stringOne, stringTwo);
		return string;
	}
	
	public static String format(String string, int i) {
		String formatString = String.format(string + ". Lettere contenute: %d", i);
		return formatString;
	}
	
	public static String[] split(String string, String splitter) {
		return string.split(splitter);
	}
	

}
