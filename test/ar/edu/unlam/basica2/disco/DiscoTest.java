package ar.edu.unlam.basica2.disco;

import org.junit.Test;
import org.junit.Assert;

public class DiscoTest {
	@Test
	//Se prueba que se informe el mismo radio exterior que el enviado
	public void testRadioInterior() {
		
		Disco MiDisco = new Disco();
		MiDisco.radioInterior(15.1);
		
		Double valorEsperado = 15.1;
		Double valorObtenido=MiDisco.obtenerRadioInt();
		Assert.assertEquals(valorEsperado,valorObtenido);
		
	}	
	
	//Se prueba que se informe el mismo radio exterior que el enviado 
	@Test
	public void testRadioExterior() {
		
		Disco MiDisco = new Disco();
		MiDisco.radioExterior(15.1);
		
		Double valorEsperado = 15.1;
		Double valorObtenido=MiDisco.obtenerRadioExt();
		Assert.assertEquals(valorEsperado,valorObtenido);
		
	}

	//Se prueba que se informe el perimetro interior 
	@Test
	public void testPerimetroInterior() {
		
		Disco MiDisco = new Disco();
		MiDisco.radioInterior(5.0);
		Double valorEsperado = 31.41;
		Double valorObtenido = MiDisco.obtenerPerimetroInterior();
		Assert.assertEquals(valorEsperado,valorObtenido, 0.01);
		
	}
	
	//Se prueba que se informe el perimetro exterior 
	@Test
	public void testPerimetroExterior() {
		
		Disco MiDisco = new Disco();
		MiDisco.radioExterior(5.0);
		Double valorEsperado = 31.41;
		Double valorObtenido = MiDisco.obtenerPerimetroExterior();
		Assert.assertEquals(valorEsperado,valorObtenido, 0.01);
	}
	

	//Se prueba que se informe la superficie correcta 
	@Test
	public void testSuperfici() {
		
		Disco MiDisco = new Disco();
		MiDisco.radioExterior(5.0);
		MiDisco.radioInterior(2.5);
		Double valorEsperado = 185.05;
		Double valorObtenido = MiDisco.obtenerSuperficie();
		Assert.assertEquals(valorEsperado,valorObtenido,0.01);
	}

}
