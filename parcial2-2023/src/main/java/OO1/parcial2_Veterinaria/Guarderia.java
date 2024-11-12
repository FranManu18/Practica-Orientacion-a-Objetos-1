package OO1.parcial2_Veterinaria;

public class Guarderia extends Servicio {
	private int dias;

	public Guarderia(Mascota mascota, int dias) {
		super(mascota);
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}
	
	@Override
	public double costo() {
		if(this.getMascota().getServicios().size()>=5) {
			return 500-500*0.1;
		}
		return 500;
	}
}
