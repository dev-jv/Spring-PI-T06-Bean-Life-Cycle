package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSinglePrototype {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		SecretarioEmpleado Sam = contexto.getBean("nSecretario", SecretarioEmpleado.class);
		SecretarioEmpleado Dean = contexto.getBean("nSecretario", SecretarioEmpleado.class);
		
		System.out.println(Sam);
		System.out.println(Dean);
		
		if(Sam == Dean) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
		
		contexto.close();
	}
}

/*
	singleton
	
es.pildoras.IoC.SecretarioEmpleado@26aa12dd
es.pildoras.IoC.SecretarioEmpleado@26aa12dd
Apuntan al mismo objeto


	prototype

es.pildoras.IoC.SecretarioEmpleado@26aa12dd
es.pildoras.IoC.SecretarioEmpleado@3fd7a715
No se trata del mismo objeto

*/







