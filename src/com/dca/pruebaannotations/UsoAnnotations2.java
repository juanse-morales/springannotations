package com.dca.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		// Cargar el XML de configuración
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Leer el class de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class); 
		
		// Pedir un Bean al contenedor
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		
		System.out.println(empleado.getEmail());
		System.out.println(empleado.getNombreEmpresa());
		
		// Cerrar el contexto
		contexto.close();

	}

}
