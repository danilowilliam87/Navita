import br.com.modulos.MaiorCombinacao;
import junit.framework.TestCase;

public class CombinacaoTest extends TestCase {

	private MaiorCombinacao combinacao = new MaiorCombinacao();
	
	public void testConbinacao() {
		//o valor esperado é o maior número obtido 
		//a partir das combinações de cada digito do numero
		assertEquals(321, combinacao.maiorNumero(123));
		//se o número for maior que 100.000.000 retorna -1
		assertEquals(-1, combinacao.maiorNumero(1000000000));
		assertEquals(9100, combinacao.maiorNumero(1009));
	}
}
