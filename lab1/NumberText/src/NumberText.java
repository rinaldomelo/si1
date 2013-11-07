
public class NumberText {
	
	public static String getNumberText(String number) {
		
		if (number.equals("0")) {
			return "zero";
		}
		
		return number.equals("1")? "um":"dois";
	}

}
