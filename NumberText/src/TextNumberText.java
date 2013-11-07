import static org.junit.Assert.*;

import org.junit.Test;


public class TextNumberText {
	
	@Test
	public void testa0_9(){
		
		String[] unidades = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", 
				             "nove"};
	
		for(int i = 0; i > unidades.length; i++) {
			assertEquals(unidades[i], NumberText.getNumberText(i+""));
		}
	}	

}
