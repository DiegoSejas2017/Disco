package ar.edu.unlam.basica2.disco;

//Enunciado: En grupos de a dos personas, un integrante deberá crear una clase que 
//permita modelar un Disco.
//
//Se desea conocer:
//
//radio interior.
//radio exterior.
//perímetro interior.
//perímetro exterior.
//superficie.
//Debe tener operaciones para cambiar el radio interior y el radio exterior.
//
//Luego, el otro integrante, deberá hacer los test´s aplicando lo visto en clase y
//comprobando la totalidad de la funcionalidad requerida.

public class Disco {

	private Double radioInt;
	private Double radioExt;
	private Double perInt;
	private Double perExt;
	private Double superf;
	
//Radio Interior
	
	public void radioInterior(Double radioInt) {
		this.radioInt = radioInt;
	}
	
	public Double obtenerRadioInt() {
		return radioInt;
	}

//Radio Exterior
	
	public void radioExterior(Double radioExt) {
		this.radioExt = radioExt;
	}
	
	public Double obtenerRadioExt() {
		return radioExt;
	}
	
//Perímetro Interior.
		
	public Double obtenerPerimetroInterior() {
		perInt = 2 * Math.PI * obtenerRadioInt();
		return perInt;
	}
	
//Perimetro Exterior
	public Double obtenerPerimetroExterior() {
		perExt = 2 * Math.PI * obtenerRadioExt();
		return perExt;
	}
	
//Superficie
	
	public Double obtenerSuperficie() {
		superf = (Math.pow(Math.PI * this.obtenerRadioExt(), 2)) - (Math.pow(Math.PI * this.obtenerRadioInt(), 2));
		return superf;
	}	
}

