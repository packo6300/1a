package com.noticiero.web.app.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.web.client.RestTemplate;
import com.noticiero.web.app.beans.Clima;
import com.noticiero.web.app.beans.Medidas;
import com.noticiero.web.app.service.ClimaService;

public class ClimaModel implements ClimaService {
	
	private String apiKey;
	private String urlBase;
	private int ciudad;
	private String unidad;

	/**
	 * @param apiKey the apiKey to set
	 */
	@Override
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * @param urlBase the urlBase to set
	 */
	@Override
	public void setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	@Override
	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @param unidad the unidad to set
	 */
	@Override
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	/**
	 * 
	 */
	@Override
	public Clima getClima() {
		RestTemplate restTemplate = new RestTemplate();
		String url = this.urlBase + "?id=" + ciudad + "&units=" + unidad + "&appid=" + apiKey + "&lang=es";
		Clima clima = restTemplate.getForObject(url, Clima.class);
		System.out.println(url);
		return clima;
	}

	public Date sumarRestarHorasFecha(Date fecha, int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(Calendar.DAY_OF_YEAR, dias);
		return calendar.getTime();
	}

	public String getTemperaturaPromedio(Clima clima,int dias) {
		Double promedio = 0.0;
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date fecha = new Date();
			Date fechaPromedio = this.sumarRestarHorasFecha(fecha, dias);
			ArrayList<Medidas> medidas = clima.getList();
			int cant = 0;
			for (Medidas m : medidas) {
				fecha = simpleDateFormat.parse(m.getDt_txt());
				if (fecha.before(fechaPromedio)) {
					cant++;
					System.out.println(fecha+" - "+m.getMain().getTemp());
					promedio += m.getMain().getTemp();
				}
			}
			promedio=  promedio / cant;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return String.format("%.2f", promedio);
	}
}
