import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TrenTests {

	@Test(expected=RuntimeException.class)

	public void queNoPuedeAgregarADestinosQueNoVa() {
		Destino ciudadela = new Destino("Ciudadela", 1200);
		Destino liniers = new Destino("Liniers", 2200);
		Destino flores = new Destino("Flores", 4200);
		
		List<Destino> destinos = Arrays.asList(ciudadela,
				liniers);
		Tren<ParDeZapatos> tren = new Tren<ParDeZapatos>(destinos);
		
		tren.agregar(new ParDeZapatos(liniers, 200));
		tren.agregar(new ParDeZapatos(flores, 200));
	}

	@Test
	public void quePriorizaEntregas() {

		Destino ciudadela = new Destino("Ciudadela", 1200);
		Destino liniers = new Destino("Liniers", 2200);
		
		List<Destino> destinos = Arrays.asList(ciudadela,
				liniers);
		Tren<ParDeZapatos> tren = new Tren<ParDeZapatos>(destinos);
		
		ParDeZapatos e1 = new ParDeZapatos(liniers, 200);
		ParDeZapatos e2 = new ParDeZapatos(ciudadela, 200);

		tren.agregar(e1);
		tren.agregar(e2);

		Assert.assertEquals(Arrays.asList(e1, e2), tren.getEntregables());
		
		Assert.assertEquals(Arrays.asList(e2, e1), tren.priorizarEntregables());
		
	}

}
