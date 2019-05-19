package com.unmsm.fisi.controller.mantenimiento.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unmsm.fisi.model.Producto;
import com.unmsm.fisi.service.impl.ProductoServiceImpl;

@RestController
@RequestMapping("/mantenimiento/producto")
public class ProductoRestController {
	@Autowired
	@Qualifier("productoServicio")
	private ProductoServiceImpl productoServicio;
	
	@GetMapping
	public List<Producto> listarTodos(){
		System.out.println("Cantidad : " + productoServicio.listarProductos().size());
		return productoServicio.listarProductos();
	}
}
