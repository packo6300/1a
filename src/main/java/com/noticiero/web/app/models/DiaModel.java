package com.noticiero.web.app.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.noticiero.web.app.beans.Dia;

public class DiaModel {
	
	public Map<Integer,String> getDias(){
		List<Dia> diaList= new ArrayList<>();
		diaList.add(new Dia(1,"24  hrs (1 Día)"));
		diaList.add(new Dia(2,"48  hrs (2 Días)"));
		diaList.add(new Dia(3,"72  hrs (3 Días)"));
		diaList.add(new Dia(4,"96  hrs (4 Dias)"));
		diaList.add(new Dia(5,"120 hrs (5 Dias)"));
		Map<Integer,String> dias= diaList.stream().collect(Collectors.toMap(Dia::getNumero, Dia::getNombre));
		return dias;
	}
}
