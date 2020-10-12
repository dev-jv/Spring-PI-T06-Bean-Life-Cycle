package es.pildoras.IoC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*
		// Creación de objetos de tipo Empleado
		Empleados Empleado1 = new SecretarioEmpleado(); // Una interfaz y el const pertenece a una clase que implementa dicha interf  ... Abstracción
//		Empleados Empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		System.out.println(Empleado1.getTareas());
		*/
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml"); // Cargar archivo xml
		
		DirectorEmpleado Jorge = contexto.getBean("cDirector", DirectorEmpleado.class);
		System.out.println(Jorge.getTareas());
		System.out.println(Jorge.getInforme());
		System.out.println("Email: " + Jorge.getEmail());
		System.out.println("Empresa: " + Jorge.getNombreEmpresa());
		
		Empleados Juan = contexto.getBean("cJefe", Empleados.class); // Pedir el bean
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme()); // Utilizar el bean
		
		SecretarioEmpleado Kevin = contexto.getBean("sSecretario", SecretarioEmpleado.class); // Es necesario cambiar a SecretarioEmpleado para utilizar los nuevos métodos
		SecretarioEmpleado Maria = contexto.getBean("sSecretario", SecretarioEmpleado.class);
		System.out.println(Kevin.getTareas());
		System.out.println(Kevin.getInforme());
		System.out.println("Email: " + Kevin.getEmail());
		System.out.println("Empresa: " + Kevin.getNombreEmpresa());
		System.out.println("Email: " + Maria.getEmail());
		System.out.println("Empresa: " + Maria.getNombreEmpresa()); // Puedes reutilizar el código
		
		contexto.close(); // Cerrar el xml
		

	}
}


