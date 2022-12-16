package com.bolsadeideas.springboot.di.app.models.service;

//@Component("mySimpleService")
//@Primary
public class MyService implements IServiceAdaptable{

	@Override
	public String operacion() {
		return "RUNNING THE SIMPLE TASK, PLEASE WAIT A FEW MINUTES...";
	}

	
}
