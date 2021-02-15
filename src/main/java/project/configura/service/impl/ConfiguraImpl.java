package project.configura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.configura.entites.Configuracion;
import project.configura.repository.ConfiguracionRepository;
import project.configura.service.Configura;

@Service
public class ConfiguraImpl implements Configura {

	@Autowired
	private ConfiguracionRepository rep;

	public void populate() {
		Configuracion con1 = new Configuracion(null, "test1", "value1", "description1");
		Configuracion con2 = new Configuracion(null, "test2", "value2", "description2");
		Configuracion con3 = new Configuracion(null, "test3", "value3", "description3");
		Configuracion con4 = new Configuracion(null, "test4", "value4", "description4");
		Configuracion con5 = new Configuracion(null, "test5", "value5", "description5");

		rep.save(con1);
		rep.save(con2);
		rep.save(con3);
		rep.save(con4);
		rep.save(con5);

	}

	public List<Configuracion> findAll() {
		return rep.findAll();
	}

}
