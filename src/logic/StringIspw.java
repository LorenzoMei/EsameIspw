package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StringIspw {

	public static void main(String[] args) {
		String[] string = new String[2];
	    String arg = "Lettere contenute nella stringa contatenata %d";
		
		Logger logger = Logger.getLogger("StringIspw");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(input);
		
		for(int i = 0; i < 2; i++) {
			String msg = String.format("Inserisci la stringa numero %d \n", i);
			logger.log(Level.INFO, msg);
			try {
				string[i] = buffer.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		String resultConc = conc(string[0], string[1], "-");
		String resultFormat = format(arg, resultConc.length());
		String[] resultSplit = split(resultConc, "-");
		logger.log(Level.INFO, "Stringhe concatenate: " + resultConc);
		logger.log(Level.INFO, "Stringa formattata: " + resultFormat);
		
		for(int i = 0; i < resultSplit.length; i++) {
			logger.log(Level.INFO, "String " + i + ": " + resultSplit[i]);
		}
		
	}
	
	public static String conc(String stringOne, String stringTwo, String delimiter) {
		return String.join(delimiter, stringOne, stringTwo);
	}
	
	public static String format(String string, int i) {
		return String.format(string, i);
	}
	
	public static String[] split(String string, String splitter) {
		return string.split(splitter);
	}
	

}
