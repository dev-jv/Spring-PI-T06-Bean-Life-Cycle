package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseBeanLifeCicle {
	
	public static void main (String[] arg) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml"); // Cargar el xml
		
		Empleados Hal = contexto.getBean("iDirector", Empleados.class); // Obtenemos el bean
		System.out.println(Hal.getInforme());
		
		contexto.close(); // Cerrar el contexto
	}
}


