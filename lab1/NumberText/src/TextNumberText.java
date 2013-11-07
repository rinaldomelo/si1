import static org.junit.Assert.*;

import org.junit.Test;

public class TextNumberText {
	
	@Test
	public void testa0A20() {
		
		String[] numbersTextZeroToTwenty = {"zero", "um", "dois", "tres", "quatro", "cinco",
										"seis", "sete", "oito", "nove", "dez", "onze", "doze", 
										"treze", "quatorze", "quinze", "desseseis", "dezessete",
										"dezoito", "dezenove","vinte"};
		
		for (int i = 0; i < numbersTextZeroToTwenty.length; i++) {
			
			assertEquals(numbersTextZeroToTwenty[i], NumberText.getNumberText(i+""));
		}
	}	
}
