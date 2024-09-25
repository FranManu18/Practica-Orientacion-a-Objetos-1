package ar.edu.unlp.objectos.uno.ejercicio3_Presupuesto;
import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	private List<Item> productos;
	private LocalDate fecha;
	private String cliente;
	
	public Presupuesto( String cliente) {
		this.productos = new ArrayList<Item>();
		this.fecha = LocalDate.now();
		this.cliente = cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}

	
	public void agregarItem(Item Item) {
		this.productos.add(Item);
	}
	
	public double calcularTotal() {
		return this.productos.stream()
				.mapToDouble(Item::costo)
				.sum();
	}
	
	/*
	 * 3. Formas de inicialización:
Inicialización mediante constructor:
Se pueden inicializar las variables directamente en el constructor, como se muestra en ambas clases. Esto asegura que al crear un objeto, todas sus variables importantes estén asignadas con valores.
Inicialización mediante setters (no utilizado en el código actual):
Alternativamente, podrías declarar las variables sin inicializarlas en el constructor y luego usar métodos setters para asignarles valores después de crear el objeto.
4. Ventajas y desventajas de cada forma de inicialización:
Constructor:
Ventajas:
Consistencia y seguridad: Asegura que todas las variables esenciales estén inicializadas en el momento de la creación del objeto.
Inmutabilidad controlada: Si no se exponen setters, se puede hacer que los objetos sean inmutables después de la creación.
Desventajas:
Falta de flexibilidad: Si los objetos tienen muchos atributos o algunos opcionales, el constructor puede volverse largo y difícil de manejar, afectando la legibilidad.
Dificultad para futuras extensiones: Si hay que agregar más parámetros o cambiar la estructura, es más complicado modificar un constructor que cambiar setters.
Setters:
Ventajas:
Flexibilidad: Permiten inicializar o modificar las variables después de la creación del objeto, lo que puede ser útil cuando algunas variables son opcionales o dependen de otra lógica.
Facilidad para extender: Es más fácil agregar nuevos atributos sin cambiar un constructor complejo.
Desventajas:
Riesgo de inconsistencia: Si los setters no se usan correctamente o si se omite alguno, el objeto puede quedar en un estado inconsistente, con variables no inicializadas.
Pérdida de inmutabilidad: Con setters, los objetos pueden cambiar sus estados después de haber sido creados, lo que puede generar problemas si no se maneja adecuadamente.
	 */
}
