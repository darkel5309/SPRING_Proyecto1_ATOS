package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{
	
	// generar constructor
	public JefeEmpleado(CreacionInformes informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
}