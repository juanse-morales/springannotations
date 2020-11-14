package com.dca.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		// Cargar el XML de configuraci�n
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Leer el class de configuraci�n
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class); 
		
		// Pedir un Bean al contenedor
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		
		// Cerrar el contexto
		contexto.close();

	}

}
