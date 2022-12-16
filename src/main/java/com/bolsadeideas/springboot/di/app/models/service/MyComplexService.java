package com.bolsadeideas.springboot.di.app.models.service;

//@Component("myComplexService")
public class MyComplexService implements IServiceAdaptable{

	@Override
	public String operacion() {
		return "RUNNING THE COMPLEX TASK, PLEASE WAIT A FEW MINUTES...";
	}

	
}
