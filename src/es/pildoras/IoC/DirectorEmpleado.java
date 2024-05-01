package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	// creacion de campo tipo CreacionInforme (interfaz)

	private CreacionInformes informeNuevo;

	// crear campos para inyeccion de campos
	private String email;

	private String nombreEmpresa;

	// creacion de contructor que inyecta la dependencia

	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	// getters y setters de email y nombreEmpresa
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

	// metodo init. Ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		// añadimos todas las tareas que queramos que esten disponibles
		System.out.println("Dentro del metodo init. Aquí irian las tareas ejecutar " + " antes de que el bean esté listo");
	}

	// metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado
	public void metodoFinal() {
		// añadimos todas las tareas que queramos que esten disponibles
		System.out.println("Dentro del metodo destroy. Aquí irian las tareas ejecutar " + " después de utilizar el bean");
	}
}
