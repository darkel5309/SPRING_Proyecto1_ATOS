package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * // creacion de objetos de tipo empleado
		 * 
		 * Empleados Empleado1 = new DirectorEmpleado();
		 * 
		 * // uso de los objetos creados
		 * 
		 * System.out.println(Empleado1.getTareas());
		 */

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// probar dependencia con constructor
		/*
		 * Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		 * 
		 * System.out.println(Juan.getTareas());
		 * 
		 * System.out.println(Juan.getInforme());
		 * 
		 * contexto.close();
		 */

		// probar dependencia con setter
		/*
		 * Empleados Maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		 * 
		 * System.out.println(Maria.getTareas());
		 * 
		 * System.out.println(Maria.getInforme());
		 */

		// probar inyeccion de campos con secretarios
		/*
		 * SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",
		 * SecretarioEmpleado.class);
		 * 
		 * SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado",
		 * SecretarioEmpleado.class);
		 * 
		 * System.out.println(Maria.getTareas());
		 * 
		 * System.out.println(Maria.getInforme());
		 * 
		 * System.out.println("Email: " + Maria.getEmail());
		 * 
		 * System.out.println("Empresa: " + Maria.getNombreEmpresa());
		 * 
		 * System.out.println("Email Pablo: " + Pablo.getEmail());
		 */

		// probar inyeccion de campos con directores

		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(Juan.getTareas());

		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());

		contexto.close();

	}

}
