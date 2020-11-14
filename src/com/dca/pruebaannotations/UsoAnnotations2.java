package com.dca.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		// Cargar el XML de configuración
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Leer el class de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class); 
		
		// Pedir un Bean al contenedor
		Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados lucia = contexto.getBean("comercialExperimentado", Empleados.class);
		
		if(antonio == lucia ) {
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(antonio + "\n" +lucia);
		}else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(antonio + "\n" +lucia);
		}
		
		// Cerrar el contexto
		contexto.close();

	}

}
