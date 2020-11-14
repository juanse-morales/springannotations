package com.dca.pruebaannotations;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe financiero del Departamento de compras año 2018";
	}

}
