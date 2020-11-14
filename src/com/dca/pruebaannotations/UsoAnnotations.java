package com.dca.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		// Cargar el XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir un Bean al contenedor
		Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		// Usar el Bean
		System.out.println(antonio.getTareas());
		System.out.println(antonio.getInforme());
		
		// Cerrar el contexto
		contexto.close();
	}

}
