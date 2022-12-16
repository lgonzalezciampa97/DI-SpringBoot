package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServiceAdaptable;
import com.bolsadeideas.springboot.di.app.models.service.MyComplexService;
import com.bolsadeideas.springboot.di.app.models.service.MyService;

@Configuration
public class AppConfig {

	@Bean("mySimpleService")
	@Primary
	public IServiceAdaptable registerMyService () {
		return new MyService();
	}
	
	@Bean("myComplexService")
	public IServiceAdaptable registerMyComplexService () {
		return new MyComplexService();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);
		Producto producto3 = new Producto("Gafas de Sol Ray Ban", 500);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		ItemFactura linea3 = new ItemFactura(producto3, 6);
		
		return Arrays.asList(linea1,linea2, linea3);
		
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Monitor LG LCD 24\"", 250);
		Producto producto2 = new Producto("Notebook ASUS", 500);
		Producto producto3 = new Producto("Impresora HP Multifuncional", 80);
		Producto producto4 = new Producto("Escritorio Oficina", 300);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		ItemFactura linea3 = new ItemFactura(producto3, 6);
		ItemFactura linea4 = new ItemFactura(producto4, 3);
		
		return Arrays.asList(linea1,linea2, linea3, linea4);
		
	}
	
}
