import java.util.HashMap;


public class NumberText {
	
	public static String getNumberText(String number) {
		
		HashMap<String, String> TABELA = new HashMap<>();
		TABELA.put("0", "zero"); TABELA.put("1", "um"); TABELA.put("2", "dois");
		TABELA.put("3", "tres"); TABELA.put("4", "quatro"); TABELA.put("5", "cinco");
		TABELA.put("6", "seis"); TABELA.put("7", "sete"); TABELA.put("8", "oito");
		TABELA.put("9", "nove");
		
		
		if (number.equals("0")) {
			return "zero";
		}
		
		return number.equals("1")? "um":"dois";
	}

}
	