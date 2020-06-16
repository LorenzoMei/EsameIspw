package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StringIspw {

	public static void main(String[] args) {
		String[] string = new String[2];
		String msg = "";
	    
		
		Logger logger = Logger.getLogger("StringIspw");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(input);
		
		for(int i = 0; i < 2; i++) {
			msg = String.format("Inserisci la stringa numero %d", i);
			logger.log(Level.INFO, msg);
			try {
				string[i] = buffer.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		String resultConc = conc(string[0], string[1], "-");
		String resultFormat = format(resultConc.length());
		String[] resultSplit = split(resultConc, "-");
		
		msg = String.format("Stringhe concatenate: %s", resultConc);
		logger.log(Level.INFO, msg);
		msg = String.format("Stringa formattata: %s", resultFormat);
		logger.log(Level.INFO, msg);
		
		for(int i = 0; i < resultSplit.length; i++) {
			msg = String.format("Stringa %d: %s", i, resultSplit[i]);
			logger.log(Level.INFO, msg);
		}
		
	}
	
	public static String conc(String stringOne, String stringTwo, String delimiter) {
		return String.join(delimiter, stringOne, stringTwo);
	}
	
	public static String format(int i) {
		String arg = "Lettere contenute nella stringa contatenata %d";
		return String.format(arg, i);
	}
	
	public static String[] split(String string, String splitter) {
		return string.split(splitter);
	}
	

}
