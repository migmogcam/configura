package project.configura.service;

import java.util.List;

import project.configura.entites.Configuracion;

public interface Configura {
	
	void populate();
	
	List<Configuracion> findAll();

}
