package com.noticiero.web.app.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.noticiero.web.app.beans.Ciudad;
public class CiudadesModel {
	public CiudadesModel() {
		
	}
	public Map<Integer,String> getCiudades(){
		List<Ciudad> ciudadList= new ArrayList<>();
		ciudadList.add(new Ciudad(4014338,"Chihuahua, MX"));
		ciudadList.add(new Ciudad(4013708,"Ciudad Juarez, MX"));
		ciudadList.add(new Ciudad(3530597,"Mexico City, MX"));
		ciudadList.add(new Ciudad(3995465,"Monterrey, MX"));
		Map<Integer,String> ciudades = ciudadList.stream().collect(Collectors.toMap(Ciudad::getId, Ciudad::getName));
		return ciudades;
	}
}
