package logic;

public class StringIspw {

	public static void main(String[] args) {
		String stringOne = "Prima string";
		String stringTwo = "Seconda stringa";
		
		String resultConc = conc(stringOne, stringTwo, "-");
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
