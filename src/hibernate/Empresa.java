package hibernate;

public class Empresa {

	private String CIF;
	private String nombre;
	private int empleados;
	private String direccion;
	
	public Empresa()
	{
		
	}
	
	public Empresa(String cIF, String nombre, int empleados, String direccion) {
		super();
		CIF = cIF;
		this.nombre = nombre;
		this.empleados = empleados;
		this.direccion = direccion;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empresa [CIF=" + CIF + ", nombre=" + nombre + ", empleados=" + empleados + ", direccion=" + direccion
				+ "]";
	}
	
	
}
