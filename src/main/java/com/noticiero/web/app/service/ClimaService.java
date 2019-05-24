package com.noticiero.web.app.service;

import com.noticiero.web.app.beans.Clima;

public interface ClimaService  {
	
	public void setApiKey(String apiKey);
	public void setUrlBase(String urlBase);
	public void setCiudad(Integer ciudad);
	public void setUnidad(String unidad);
	public Clima getClima();
}
