package com.noticiero.web.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.noticiero.web.app.beans.Ciudad;
import com.noticiero.web.app.beans.Clima;
import com.noticiero.web.app.models.CiudadesModel;
import com.noticiero.web.app.models.ClimaModel;
import com.noticiero.web.app.models.DiaModel;

@Controller
@RequestMapping({"/",""})
public class IndexController {
	@Value("${api.clima.key}")
	private String apiKey;
	@Value("${api.clima.url}")
	private String urlBase;
	
	@GetMapping({"/",""})
	public String index(
			@RequestParam(required = false,defaultValue = "metric") String units,
			@RequestParam(required = false,defaultValue = "4014338") Integer ciudad, 
			@RequestParam(required = false,defaultValue = "1") Integer dia, 
			Model model
			) {				
				CiudadesModel ciudades = new CiudadesModel();
				Map<Integer,String> ciudadesList=ciudades.getCiudades();
				ClimaModel climaModel = new ClimaModel();
				DiaModel diaModel= new DiaModel();
				String ciudadName = ciudadesList.get(ciudad);				
				climaModel.setCiudad(ciudad);
				climaModel.setUnidad(units);
				climaModel.setUrlBase(urlBase);
				climaModel.setApiKey(apiKey);
				Clima clima= climaModel.getClima();
				model.addAttribute("title","Home page");
				model.addAttribute("units",units);
				model.addAttribute("dia", dia);
				model.addAttribute("unidades",(units.equals("metric")) ? "C°":"F°");
				model.addAttribute("idCiudad",ciudad);
				model.addAttribute("ciudades",ciudadesList);
				model.addAttribute("dias", diaModel.getDias());
				model.addAttribute("clima",clima);
				model.addAttribute("ciudad",ciudadName);
				model.addAttribute("temperaturaPromedio",climaModel.getTemperaturaPromedio(clima,dia));
		return "index";
	}		
}
