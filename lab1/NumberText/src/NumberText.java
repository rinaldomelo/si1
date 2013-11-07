import java.util.HashMap;


public class NumberText {
	
	public static String getNumberText(String number) {
		
		HashMap<String, String> TABELA = new HashMap<>();
	
		
		TABELA.put("0", "zero"); TABELA.put("1", "um"); TABELA.put("2", "dois");
		TABELA.put("3", "tres"); TABELA.put("4", "quatro"); TABELA.put("5", "cinco");
		TABELA.put("6", "seis"); TABELA.put("7", "sete"); TABELA.put("8", "oito");
		TABELA.put("9", "nove"); TABELA.put("11", "onze"); TABELA.put("12", "doze"); 
		TABELA.put("13", "treze"); TABELA.put("14", "quatorze"); TABELA.put("10", "dez");
		TABELA.put("15", "quinze"); TABELA.put("16", "desseseis"); TABELA.put("17", "dezessete"); 
		TABELA.put("18", "dezoito"); TABELA.put("19", "dezenove"); TABELA.put("20", "vinte"); 
		
		return TABELA.get(number);
	}

}
	