package com.dca.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	@Autowired
	@Qualifier("informeFinancieroTrim3")
	private CreacionInformeFinanciero nuevoInforme;
	
	/* @Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	} */
	
	/*
	@PostConstruct
	public void init() {
		System.out.println("Init");
	}
	
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}
	*/
	
	@Override
	public String getTareas() {
		
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInforme() {
		
		//return "Informe generedo por el comercial";
		
		return this.nuevoInforme.getInformeFinanciero();
	}

	/* @Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	} */
	
	

}
