package ar.edu.unlp.objectos.uno.ejercicio12_VolumenYSuperficieDeSolidos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
public class TestPieza {
	private ReporteDeConstruccion reporte;
	private List<Pieza>piezas;
	
	@BeforeEach
	void setUp() {
		piezas=new LinkedList();
		
		piezas.add(new Cilindro(5,10,"Hierro","Rojo"));
		piezas.add(new Esfera(10,"Hierro","Rojo"));
		piezas.add(new PrismaRectangular(5,10,20,"Acero","Azul"));//700
		
		reporte=new ReporteDeConstruccion(piezas);
	}
	
	@Test
	public void testCilindro() {
		Cilindro cilindro=new Cilindro(5,10,"Hierro","Rojo");
		assertEquals(5,cilindro.getRadio());
		assertEquals(10,cilindro.getAltura());
		assertEquals(785.39816339744830961566084581988,cilindro.getVolumen());
		assertEquals(471.23889803846898576939650749193,cilindro.getSuperficie());
	}
	
	@Test
	public void testEsfera() {
		Esfera esfera=new Esfera(10,"Hierro","Rojo");
		assertEquals(10,esfera.getRadio());
		assertEquals(4188.7902047863909846168578443727,esfera.getVolumen());
		assertEquals(1256.6370614359172953850573533118,esfera.getSuperficie());
	}
	
	@Test
	public void testPrisma() {
		PrismaRectangular prisma=new PrismaRectangular(5,5,10,"Acero","Azul");
		assertEquals(5,prisma.getLadoMayor());
		assertEquals(5,prisma.getLadoMenor());
		assertEquals(10,prisma.getAltura());
		assertEquals(250,prisma.getVolumen());
		assertEquals(250,prisma.getSuperficie());
	}
	
	@Test
	public void testPieza() {
		Pieza cilindro=new Cilindro(5,10,"Hierro","Rojo");
		assertEquals("Hierro",cilindro.getMaterial());
		assertEquals("Rojo",cilindro.getColor());
	}
	
	@Test 
	public void testReporte() {
		assertEquals(3,reporte.getPiezas().size());
		reporte.agregarPieza(new Esfera(10,"Acero","Azul"));
		assertEquals(4,reporte.getPiezas().size());
		assertEquals(4974.1883681838392942325186901926,reporte.volumenDeMaterial("Hierro"));
		assertEquals(1956.6370614359172953850573533118,reporte.getSuperficieDeColor("Azul"));
	}
}
	
