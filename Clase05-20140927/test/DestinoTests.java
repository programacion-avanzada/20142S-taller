import org.junit.Assert;
import org.junit.Test;


public class DestinoTests {

	@Test
	public void queDosDestinosSabenCompararse() {
		
		Destino destino1 = new Destino("Ciudadela", 1200);
		Destino destino2 = new Destino("Liniers", 2200);
		
		Assert.assertTrue(destino1.compareTo(destino2) < 0);
		Assert.assertTrue(destino1.compareTo(destino1) == 0);
		Assert.assertTrue(destino2.compareTo(destino1) > 0);
		
	}
	
}
