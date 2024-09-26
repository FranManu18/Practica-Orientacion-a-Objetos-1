package test.java.ar.edu.unlp.objectos.uno.ejercicio11_Inversion;

import java.time.LocalDate;
import java.util.List;


public class InversionTest {
	protected Inversor inversor;
	
	private void initializeInversor() {
		List<Inversion>inversiones=null;
		LocalDate fechaEspecifica = LocalDate.of(2024, 9, 20);
		PlazoFijo plazoFijo = new PlazoFijo(fechaEspecifica,200.2, 13.5);
		inversiones.add(plazoFijo);
		InversionEnAcciones acciones=new InversionEnAcciones("Juan",2,20.3);
		inversiones.add(acciones);
		inversor=new Inversor("Francisco",inversiones);
	}
	
	@BeforeEach
	void setUp() {
		this.initializeInversor();
	}
	
}
