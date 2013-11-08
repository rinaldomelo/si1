import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TextNumberText {

	String[] unidades = {"um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};

	
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

	@Test
	public void testaDezenas() {

		String[] dezenas = {"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

		for (int i = 0; i < dezenas.length; i++) {

			assertEquals(dezenas[i], NumberText.getNumberText(((i+1)*10)+""));
		}
	}

	@Test
	public void testa21A99() {

		String[] dezenas = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

		for (int i = 0; i < dezenas.length; i++) {

			for (int j = 0; j < unidades.length; j++) {

				assertEquals(dezenas[i]+" e "+unidades[j], NumberText.getNumberText(((i+2)*10)+(j+1)+""));
			}
		}
	}

	@Test
	public void testaCentenas() {

		String[] dezenas = {"cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};

		for (int i = 0; i < dezenas.length; i++) {

			assertEquals(dezenas[i], NumberText.getNumberText(((i+1)*100)+""));
		}
	}

	@Test
	public void testa101A110() {

		
		assertEquals("cento e um", NumberText.getNumberText("101"));
	}
}
